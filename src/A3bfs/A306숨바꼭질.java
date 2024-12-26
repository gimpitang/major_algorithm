package A3bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A306숨바꼭질 {//       백준#1697
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lacation = br.readLine().split(" ");
        int now = Integer.parseInt(lacation[0]);
        int target = Integer.parseInt(lacation[1]);

        Queue<int[]>queue = new LinkedList<>();
        int count =0;
        queue.add(new int[]{now, count});
        boolean [] visit = new boolean[100001];
        visit[now]=true;
        while (!queue.isEmpty()){
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            int[]dx = {1,-1,x};
            if(x==target){
                System.out.println(y);
                break;
            }


            for (int i = 0; i < 3; i++) {
                int nx = x + dx[i];
                int ny = y + 1;
                if (nx >= 0 && nx <= 100000&&!visit[nx]) {
                    if (nx == target) {

                        System.out.println(ny);
                        break;
                    }
                    queue.add(new int[]{nx, ny});
                    visit[nx]=true;
                }
            }


        }





    }
}
