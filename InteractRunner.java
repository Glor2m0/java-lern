import java.util.scanner;

/*Класс для щапуска калькулятора, поддерживает ввод польщователя.*/

public class InteractRunner{

public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        try{
        Calculator exit="no";
        String exit="no";
        While(!exit.equals("yes"));{
            System.out.println("Enter first arg: ");
            String first=reader.next();
            System.out.println("Enter second arg: ");
            String second=reader.next();
            calc.add(Integer.valueOf(first),Integer.valueOf(second));
            Syste.out.println("Resulr: "+calc.getResult());
            calc.cleanResult();
            System.out.println("Exit yes/no ");
            exit=reader.next;
        }
        }finally{
        reader.close();
        }
        }
        }