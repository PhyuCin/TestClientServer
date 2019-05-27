public class MiniGame {

    private int num;

    public MiniGame(){
        this.num = 0;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public static void main(String[] args){
        MiniGame one = new MiniGame();
        System.out.println("" + one.getNum());

        one.setNum(1);
        System.out.println("" + one.getNum());
    }
}
