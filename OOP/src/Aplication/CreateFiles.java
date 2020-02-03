package Aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import Entities.File;

public class CreateFiles {

	public static void  main(String[] args) throws IOException {
		JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		File file = new File();
		File fileSave = new File();
		
		fileChooser.setDialogTitle("Select the DOC with words to recorded");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		int returnValue = fileChooser.showOpenDialog(null);
		
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			if (fileChooser.getSelectedFile().isFile()) {
				file.setPath(fileChooser.getSelectedFile().toString());
				if(file.verifyFile(file.getPath())) {
					BufferedReader br = new BufferedReader(new FileReader(file.getPath()));
					//FileWritter fw = new FileWriter(arg0)
					while(br.ready()){
						String linha = br.readLine();
						System.out.println(linha);
						//PrintWriter writer = new PrintWriter("/home/alanoliveira/words/"+linha+".txt", "UTF-8");
						fileSave.setPath("/home/alanoliveira/words/"+linha+".txt");
						FileWriter fw = new FileWriter(fileSave.getPath());
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(linha);
						bw.close();
						
				}
			}
		}
	}

  }
}