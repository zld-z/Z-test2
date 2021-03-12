import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Province {
	public static void main(String args[]) {
		FileReader rf=null;
		try{
			rf=new FileReader("D:\\GitHub\\Test2\\yq_in.txt");
			BufferedReader br=new BufferedReader(rf);
			String line;
			String str=" ";
			try{
				while((line=br.readLine())!=null){
					String pr=line.substring(0,3);
					if(!pr.equals(str)){
						System.out.println(pr);
						str=pr;
					}
					else{
						System.out.println(line.substring(3,line.length()));
					}
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try{
				rf.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}