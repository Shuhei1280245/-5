public class SingletonTest{
    public static void main(String[] args){
        Renban renbanA = Renban.getInstance();
        Renban renbanB = Renban.getInstance();

        System.out.println(renbanA.getNumber());
        System.out.println(renbanB.getNumber());
        System.out.println(renbanB.getNumber());
        System.out.println(renbanA.getNumber());
        System.out.println(renbanB.getNumber());

    }

}
class Renban { 

    private static Renban instance = new Renban();

    private Renban(){
        this.bangou = 0;

        //外部からインスタンス化できないよう、private宣言
    }

    public static Renban getInstance() {
        return instance;
    }
    public void renbanA(int bangou){
        if (renbanA == renbanB)
            renbanB += bangou;
        else if (renbanA <= 9999)
            renbanA += bangou;
        else return;
    }
    public void renbanB(int bangou){
        if (renbanA == renbanB)
            renbanA += bangou;
        else if (renbanB <= 9999)
            renbanB += bangou;
        else return;
    }
        
}

//わかりませ～ん；；
