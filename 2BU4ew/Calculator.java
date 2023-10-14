class Calculator{
    public void addition(int number1,int number2 ){
        int sum = number1+number2;
        System.out.println("Addition: "+sum);
    }

    public void substraction(int number1,int number2 ){
        int sub = number1-number2;
        System.out.println("Substraction: "+sub);
    }
    public void multiplication(int number1,int number2 ){
        int multiplication = number1*number2;
        System.out.println("Multiplication: "+multiplication);
    }
    public void division(int number1,int number2 ){
        int div = number1/number2;
        System.out.println("Division: "+div);
    }


    public static void main(String[]args){
        Calculator cal1 = new Calculator();
        cal1.addition(3,4);
        cal1.substraction(5,2);
        cal1.multiplication(3,4);
        cal1.division(10,3);
    }
}