public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();        	
        	//outra forma de pegar mais que uma exception
        	//another way to catch more than one exception
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    //Checked
    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        
//        ArithmeticException exception = new ArithmeticException("Deu erro");
//        throw exception;
        
        throw new MinhaExcecao("DEu errado");
        
        //System.out.println("Fim do metodo2");
    }
    
    	//unchecked
//    private static void metodo2() {
//        System.out.println("Ini do metodo2");
//        
////        ArithmeticException exception = new ArithmeticException("Deu erro");
////        throw exception;
//        
//        throw new MinhaExcecao("DEu errado");
//        
//        //System.out.println("Fim do metodo2");
//    }
}