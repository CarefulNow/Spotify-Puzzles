import java.util.*;

public class ZipfsSong {
    static int songsToPick = 0;

    public static void main(String[] argc) {
        List<String> songDataList = readData();
        Map<Double, String> result = findBestSongs(songDataList);
        TreeMap<Double, String> sortedResult = new TreeMap<Double, String>(result);
        for(int i = 0;i < songsToPick;i++) {
            double key = sortedResult.lastKey();
            System.out.println(sortedResult.get(key));
            sortedResult.remove(key);
        }
    }

    public static List<String> readData() {
        List<String> data = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String[] firstLine = line.split(" ");
        int numSongs = Integer.valueOf(firstLine[0]);
        songsToPick = Integer.valueOf(firstLine[1]);

        while(--numSongs >= 0) {
            line = input.nextLine();
            data.add(line);
        }

        return data;
    }

    public static Map<Double, String> findBestSongs(List<String> songDataList) {
        Map<Double, String> songOrderMap = new HashMap<Double, String>();

        double rank = 0;
        for(String songData : songDataList) {
            String[] data = songData.split(" ");
            double playCount = Integer.valueOf(data[0]);
            String songName = data[1];

            double rating = playCount * ++rank;
            songOrderMap.put(rating, songName);
        }

        return songOrderMap;
    }
}
