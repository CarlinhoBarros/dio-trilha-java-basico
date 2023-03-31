public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        tv.botaoLigarDesligar();
        System.out.println(tv);

        tv.botaoLigarDesligar();
        System.out.println(tv);

        tv.botaoLigarDesligar();
        tv.alterarCanal(200);
        for(int i = 0; i < 22; i++)
            tv.diminuirVolume();
        
        System.out.println(tv);

    }
}
