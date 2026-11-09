class Solution {
    public long dividePlayers(int[] skill) {

        HashMap<Integer, Integer> valueAndFrequency = new HashMap<>();

        int skillTotal = 0;
        long skillTotalOfTeam = 0; 

        for (int i : skill) {
            skillTotal += i;
            valueAndFrequency.put(i, valueAndFrequency.getOrDefault(i, 0) + 1);
        }

        int teams = skill.length / 2;

        if (skillTotal % teams != 0) {
            return -1;
        }

        int skillTotalForTeam = skillTotal / teams;

        for (int i = 0; i < skill.length; i++) {

            if (valueAndFrequency.get(skill[i]) == 0) {
                continue;
            }

            int requiredPartner = skillTotalForTeam - skill[i];

            if (skill[i] == requiredPartner &&
                valueAndFrequency.get(skill[i]) < 2) {
                return -1;
            }

            if (valueAndFrequency.getOrDefault(requiredPartner, 0) > 0) {

                valueAndFrequency.put(skill[i], valueAndFrequency.get(skill[i]) - 1);
                valueAndFrequency.put(requiredPartner, valueAndFrequency.get(requiredPartner) - 1);

                long skillOfPair = (long) skill[i] * requiredPartner;

                skillTotalOfTeam += skillOfPair;
            } else {
                return -1;
            }
        }

        return skillTotalOfTeam;
    }
}
