package Strings;

public class ShortestRoute {
    public static float getShortestPath(String str){
        int x = 0 ; int y = 0;
        float shortestRoute = 0 ;
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i) == 'N'){
                y++;
            } else if(str.charAt(i)== 'S'){
                y--;
            } else if(str.charAt(i)== 'W'){
                x--;
            } else {
                x++;
            }
            shortestRoute =(float)Math.sqrt((x*x) + (y*y)) ;                  
        }
        return shortestRoute;
    }
    public static void main(String[] args) {
        String path = "NS";
        System.out.println(getShortestPath(path));
    }
}
