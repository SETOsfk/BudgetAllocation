package budgetallocation;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	
Scanner k=new Scanner(System.in);
System.out.println("Ne kadar harcayabilirsiniz?");
double total = k.nextDouble();
int i=0;
double sum = 0.0;
ArrayList<Double> proportion = new ArrayList<Double>();
System.out.println("Giderlerinizin oran�n� giriniz.");
System.out.println("Toplam oran 100'� ge�erse sistem durur.");
do {
	System.out.println("Gider "+(i + 1)+" 'in oran�n� giriniz." );
	double value=k.nextDouble();
	proportion.add(value);
	sum+=proportion.get(i);
	i++;
}while (sum <=100);
k.close();
if(sum>100) {
	double cumulativeSum= 0.0;
	for(int j=0; j<proportion.size()-1;j++) {
		cumulativeSum += proportion.get(j);
	}
	proportion.set(proportion.size()-1, 100.0-cumulativeSum);
	
}
for(double value : proportion) {
	double expense = value*total/100.0;
	System.out.println("Toplam paran�z�n %"+ value+"'i =$"+expense);		
}
System.out.println("Toplam harcaman�z =$" +total);

	}

}
