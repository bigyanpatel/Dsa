import java.util.*;

public class getMazePathsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMazePatahsWithJumps(1, 1, n, m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePatahsWithJumps(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        // horizontal moves

        for(int moves = 1; moves <= dc - sc; moves++){
            ArrayList<String> hPaths = getMazePatahsWithJumps(sr, sc + moves, dr, dc);
            for(String hpath: hPaths){
                paths.add("h" + moves + hpath);
            }
        }
        
        // vertical moves

        for(int moves = 1; moves <= dr - sr; moves++){
            ArrayList<String> vPaths = getMazePatahsWithJumps(sr + moves, sc, dr, dc);
            for(String vpath: vPaths){
                paths.add("v" + moves + vpath);
            }
        }

        // diagonal moves

        for(int moves = 1; moves <= dc - sc && moves <= dr - sr; moves++){
            ArrayList<String> dPaths = getMazePatahsWithJumps(sr + moves, sc + moves, dr, dc);
            for(String dpath: dPaths){
                paths.add("d"+moves+dpath);
            }
        }

        return paths;
    }
}
