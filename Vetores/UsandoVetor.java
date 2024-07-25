public class UsandoVetor {
    public static void main(String[] args)
    {
        int[] passarosPorDia = {2,5,0,7,4,1,3,0,2,5,0,1,3,1};

        int totalPassaros = 0;
        int passarosPrimeira = 0;
        int passarosSegunda = 0;

        for(int i=0; i < 14; i++)
        {
            totalPassaros = totalPassaros + passarosPorDia[i];
            if(i<7){
                passarosPrimeira = passarosPrimeira + passarosPorDia[i];
            }else{
                passarosSegunda = passarosSegunda + passarosPorDia[i];
            }
        }

        System.out.println("Passaros avistados no total: " + totalPassaros);
        System.out.println("Passaros avistados na primeira semana: " +passarosPrimeira);
        System.out.println("Passaros avistados na segunda semana: " +passarosSegunda);
    }
}
