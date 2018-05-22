
public class PlayerVideo {
	public static void main(String[] args) { 
	Filme f;
	f = new Filme();
	
	PlayerVideo p;
	p = new PlayerVideo();
	f.setNome("Um morto muito louco");
	f.setAno(1997);
	//f.set(" ");
	p.play(f);
	
	
	}
	
	public void play(Video video){
		System.out.println( "[" +video.getClass() + "] " + video.getNome() + " ("+video.getAno()+")");
		
		//String s = "a" + 1 + "b" + 75;
	}
}
