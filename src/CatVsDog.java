import java.util.*;

public class CatVsDog {
    static TreeMap<Integer, String> testCaseMetaData = new TreeMap<Integer, String>();
    static TreeMap<Integer, List<String>> testCaseData = new TreeMap<Integer, List<String>>();

    public static void main(String[] argc) {
        TreeMap<Integer, List<String>> voteDataMap = readInput();

        for(Map.Entry<Integer, List<String>> entry : voteDataMap.entrySet()) {
            int dogStayVotes = 0;
            int catStayVotes = 0;
            int maxPeopleHappy = 0;
            for (String s : entry.getValue()) {
                String[] vote = s.split(" ");
                if(vote[0].startsWith("D")) {
                    dogStayVotes++;
                } else if(vote[0].startsWith("C")) {
                    catStayVotes++;
                }
            }
            if(dogStayVotes > catStayVotes) {
                maxPeopleHappy = dogStayVotes;
            } else {
                maxPeopleHappy = catStayVotes;
            }
            System.out.println(maxPeopleHappy);
        }
    }

    public static TreeMap<Integer, List<String>> readInput() {
        Scanner input = new Scanner(System.in);
        int testCaseAmount = Integer.valueOf(input.nextLine());
        int testCase = 0;
        while(++testCase <= testCaseAmount) {
            String totals = input.nextLine();
            int voters = Integer.valueOf(totals.split(" ")[2]);
            testCaseMetaData.put(testCase, totals);
            List<String> voteDataList = new ArrayList<String>();
            while (--voters >= 0) {
                String voteData = input.nextLine();
                voteDataList.add(voteData);
            }
            testCaseData.put(testCase, voteDataList);
        }
        return testCaseData;
    }
}
