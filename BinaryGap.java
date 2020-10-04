class BinaryGap {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int countGap = 0;
        List<Integer> indexList = new ArrayList<Integer>();
        for (Integer i = 0; i < binary.length(); i++) {
            if (Integer.parseInt(String.valueOf(binary.charAt(i))) == 1) {
                indexList.add(i);
            }
        }
        if (indexList.size() > 1) {
            for (int i = 0; i < indexList.size(); i++) {
                int firstIndex = indexList.get(i);
                int secondIndex = indexList.get((i + 1) > (indexList.size() - 1) ? indexList.size() - 1 : (i + 1));
                int count = binary.substring(firstIndex, secondIndex + 1).replace("1", "").length();
                countGap = count > countGap ? count : countGap;
            }
        }
        return countGap;
    }
}
