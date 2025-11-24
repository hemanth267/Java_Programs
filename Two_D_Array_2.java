class Two_D_Array_2{
    public static void main(String[] args) {
        //3 1-D arrays
        String[] moneyheist={"professor", "berlin", "tokyo"};
        String[] squidgame={"player-456", "player-100", "player-222"};
        String[] breakingbad={"walter", "jesse", "skyler"};
        //1 2-D array
        String[][] webSeriesCast={moneyheist, squidgame, breakingbad};
        for(int i=0; i<webSeriesCast.length;i++){
            for(int j=0;j<webSeriesCast[i].length;j++){
                System.out.print(webSeriesCast[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//output:
// professor berlin tokyo 
// player-456 player-100 player-222 
// walter jesse skyler