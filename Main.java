import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numbers[]={4,2,1,5};
		String index="";
		System.out.print("[?]Target Value :");
		int target=sc.nextInt();

		int sum=0;
		for(int x=0;x<4;x++){
			int number=numbers[x];
			for(int i=x;i<3;i++){
				number+=numbers[i+1];
				if(number==target){
					index=Integer.toString(x)+" "+Integer.toString(i+1);
					break;
				}
				else{
					for(int y=i;y<2;y++){
						number+=numbers[y+1];
						if(number==target){
							index=Integer.toString(x)+" "+Integer.toString(i+1)+" "+Integer.toString(y);
							break;
						}
						else{
							for(int z=y;z<1;z++){
								number+=numbers[z+1];
								if(number==target){
									index=Integer.toString(x)+" "+Integer.toString(i+1)+" "+Integer.toString(y)+" "+Integer.toString(z);
									break;
								}
								else{
										number=numbers[0]+numbers[1]+numbers[2]+numbers[3];
										if(number==target){
											index="0 1 2 3";
											break;
										}
										else{
											index="No";
										}
									number-=numbers[z+1];
								}
							}
							number-=numbers[y+1];
						}
					}
					number-=numbers[i+1];
				}
			}
		}

		System.out.println("[+]Indices :"+index);
	}
}