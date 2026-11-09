class Solution {
    public long dividePlayers(int[] skill) {

        HashMap<Integer, Integer> valueAndFrequency = new HashMap<>();

        int skillTotal = 0;
        long skillTotalOfTeam = 0; // FIX 1: Changed to long to prevent overflow

        for (int i : skill) {
            skillTotal += i;
            valueAndFrequency.put(i, valueAndFrequency.getOrDefault(i, 0) + 1);
        }

        int teams = skill.length / 2;

        // FIX 2: Ensure total skill can be divided equally among teams
        if (skillTotal % teams != 0) {
            return -1;
        }

        int skillTotalForTeam = skillTotal / teams;

        for (int i = 0; i < skill.length; i++) {

            if (valueAndFrequency.get(skill[i]) == 0) {
                continue;
            }

            int requiredPartner = skillTotalForTeam - skill[i];

            // FIX 3: If both players have the same skill,
            // ensure at least 2 players are available
            if (skill[i] == requiredPartner &&
                valueAndFrequency.get(skill[i]) < 2) {
                return -1;
            }

            if (valueAndFrequency.getOrDefault(requiredPartner, 0) > 0) {

                valueAndFrequency.put(skill[i], valueAndFrequency.get(skill[i]) - 1);
                valueAndFrequency.put(requiredPartner, valueAndFrequency.get(requiredPartner) - 1);

                // FIX 4: Cast to long BEFORE multiplication to prevent overflow
                long skillOfPair = (long) skill[i] * requiredPartner;

                skillTotalOfTeam += skillOfPair;
            } else {
                return -1;
            }
        }

        return skillTotalOfTeam;
    }
}
