package Associacao;
public class Main {
	public static void main(String[] args) {
		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(100);
		ee.setTensao(220);
		System.out.println(ee);
		
		SistemaDeSom ss = new SistemaDeSom();
		ss.setConsumo(100);
		ss.setTensao(220);
		ss.setModelo("S3");
		ss.setPotencia(2000);
		ss.setMarca("Sonny");
		System.out.println(ss);
		
		SistemaDeVideo sv = new SistemaDeVideo();
		sv.setConsumo(100);
		sv.setTensao(220);
		sv.setModelo("LG 578");
		sv.setMarca("LG");
		sv.setResolucao("4k ultrawide");
		sv.setTipo("OLED");
		System.out.println(sv);
		
		HomeTheater ht = new HomeTheater();
		
		ht.som.setConsumo(100);
		ht.som.setTensao(220);
		ht.som.setModelo("S3");
		ht.som.setPotencia(2000);
		ht.som.setMarca("Sonny");
		
		ht.video.setConsumo(100);
		ht.video.setTensao(220);
		ht.video.setModelo("LG 578");
		ht.video.setMarca("LG");
		ht.video.setResolucao("4k ultrawide");
		ht.video.setTipo("OLED");
		
		
		
		System.out.println(ht);
	}
}
