int cod1,num1;
int cod2,num2;
double val1,val2,total;
    
	Scanner sc = new Scanner(System.in);
    
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		val1 = sc.nextDouble();
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		val2 = sc.nextDouble();
    
		total = ((num1*val1)+(num2*val2));
		System.out.printf("amount to pay = $%.2f",total);
    
	sc.close();
