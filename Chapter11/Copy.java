import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class Copy{
	public static void main(String[] args){
		if(args.length != 2){
			System.err.println("usage: java Copy srcfile dstfile");
			return;
		}
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream(args[0]);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(args[1]);
			bos = new BufferedOutputStream(fos);
			int b;
			while((b=bis.read())!=-1){
				bos.write(b);
			}
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			if(bis!=null){
				try{
					bis.close();
				}catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
			if(bos!=null){
				try{
					bos.close();
				}catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
		}
	}
}