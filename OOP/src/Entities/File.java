package Entities;

public class File {
	private String path;
	private String word;
	
	public String getWord() {
		return this.word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public String getPath() {
		return this.path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void createFiles(String nameFile) {
		
	}
	
	public boolean verifyFile(String path) {
		if(path.contains(".txt"))
			return true;
		else
			return false;
	}
	
}
