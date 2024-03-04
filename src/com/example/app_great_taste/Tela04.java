package com.example.app_great_taste;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class Tela04 extends Activity {

	private ImageSwitcher sw;
	int i = 1;
	int avanca2 = 0, avanca3 = 0;
	public static int[] bife_a_role = { R.drawable.bife_a_role2, R.drawable.bife_a_role3 };
	public static int[] bolo_carne = { R.drawable.bolo_de_carne2, R.drawable.bolo_de_carne3 };
	public static int[] banoffee = { R.drawable.banoffee2, R.drawable.banoffee3 };
	public static String bife_a_role_receita = "Corte os gomos das salsichas ao meio, no sentido transversal. Depois pegue cada metade e corte ao meio novamente (no sentido transversal) para formar as tiras. Tempere a carne com sal e pimenta disponha em cada bife uma tira cenoura, uma de bacon e duas de salsicha. Enrole a carne com os ingredientes e prenda com palitos. Derreta a manteiga em uma panela e doure a cebola, o alho e em seguida os bifes. Doure bem todos os bifes e adicione o extrato de tomate e uma lata de �gua; deixe cozinhar at� a carne ficar macia. Sirva bem quente.";
	public static String bife_a_role_ingredientes = "1 kg de colch�o mole ou patinho cortado em bifes \n Sal e pimenta do reino a gosto \n 2 cenouras em tiras \n 200 g de bacon em tiras \n 2 gomos de salsicha Viena cortadas em tiras \n 1 colher de sopa de manteiga \n 1 cebola bem picada \n 2 dentes de alho bem amassados \n 1 lata de extrato de tomate";
	public static String[] rendimento = {"8 por��es", "6 por��es", "6 por��es","6 por��es", "8 por��es", "12 por��es"};
	public static String bolo_carne_receita = "A prepara��o da massa � muito simples: juntamos � carne todos os ingredientes, menos o molho de tomate e os queijos e a panceta. Com as m�os, amassamos at� a mistura ficar bem homog�nea. O bolo pode ser modelado como desejar, mas optamos por um cilindro. Depois de moldarmos, colocamos na massa os cubos de queijo prato aleatoriamente, cuidando para cobrir os buracos com a massa. O �ltimo ato � cobrir a massa com a panceta ou bacon em fatias finas. Como usamos uma carne bem magra, o patinho, a panceta cumpriu o papel de emprestar a sua gordura para umedecer e encher de sabor o bolo. O bolo deve ser acomodado num refrat�rio ou forma que n�o seja muito maior do que o bolo, vai entrar um pouco de molho ali, daqui a pouco. Mas primeiro a gente unta o refrat�rio com azeite e acomoda o bolo j� coberto com a panceta. Vai ao forno pr�-aquecido a 180� C por uns 40 minutos. Neste tempo a gente joga sobre o bolo p molho de tomate aquecido (n�o queremos um choque t�rmico). Verta o molho sobre o bolo e deixe escorrer para os lados. Volte ao forno por mais uns 10 minutos e, ent�o, jogue o queijo parmes�o ralado sobre o bolo. Volte ao forno at� que o queijo forme aquele casquinha crocante t�pica dos parmegianas. Sobre o molho, n�s optamos por um molho de tomate caseiro. Aqui tem a receitinha completa do molho com v�deo e tudo. A gente sempre faz em quantidade grande e congela em potes menores. A� quando chega uma hora dessas � s� a gente usufruir.";
	public static String bolo_carne_ingredientes = "500g de carne mo�da (patinho) \n 1 ovo \n 3 colheres de sopa de farinha de rosca \n 2 colheres de ch� de p�prica picante (se preferir use a doce ou a defumada) \n sal a gosto \n � colher de sopa de molho ingl�s \n 2 colheres de ch� de mostarda dijon \n 50g de queijo pra cortado em cubos \n 300ml de molho de tomate \n � x�cara de queijo parmes�o ralado \n Fatias de panceta (ou bacon) para cobrir o bolo \n Azeite para untar";
	public static String banoffee_receita = "Misture o biscoito triturado (tipo farinha, bem fininho) com a margarina culin�ria, com a ponta dos dedos, at� formar uma massa lisa. Forre o fundo de uma forma de abrir (fundo falso), e asse por apenas 10 minutos, em forno preaquecido a 180�C. Retire. Deixe a massa esfriar. \n Coloque o doce de leite sobre a massa j� fria. Alise para ficar plano. \n Pique as bananas em rodelas, e distribua-as sobre o doce de leite. \n Coloque a nata por cima (se preferir, pode bat�-la para deixar em ponto de chantilly), e alise. \n Pegue uma peneira pequena, e espalhe a canela por cima passando-a pela peneira, para que pulverize melhor por toda a torta. \n Deixe na geladeira por 3 horas antes de desenformar.";
	public static String banoffee_ingredientes = "400 g de doce de leite pronto de boa qualidade (escolha um que seja bem firme) \n 10 bananas cortadas em rodelas \n 400 g de nata (chantilly, se preferir) \n 1 pacote de biscoito maisena triturado \n 200 g de margarina culin�ria \n 1 colher de ch� de canela em p� para polvilhar";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela04);

		sw = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
		final TextView txt1 = (TextView) findViewById(R.id.textView1);
		final TextView txt2 = (TextView) findViewById(R.id.textView2);
		final TextView txt3 = (TextView) findViewById(R.id.textView3);
		final TextView txt4 = (TextView) findViewById(R.id.textView4);
		final TextView txt5 = (TextView) findViewById(R.id.textView5);
		final TextView txt6 = (TextView) findViewById(R.id.textView6);
		final TextView txt7 = (TextView) findViewById(R.id.textView7);
		final TextView txt8 = (TextView) findViewById(R.id.textView8);
		final TextView txt9 = (TextView) findViewById(R.id.textView9);
		final TextView txt10 = (TextView) findViewById(R.id.textView10);
		final TextView txt11 = (TextView) findViewById(R.id.textView11);
		final TextView txt12 = (TextView) findViewById(R.id.textView12);
		final TextView txt13 = (TextView) findViewById(R.id.textView13);
		final TextView txt14 = (TextView) findViewById(R.id.textView14);
	
		Typeface font = Typeface
				.createFromAsset(getAssets(), "planetchalk.ttf");
		txt1.setTypeface(font);
		txt2.setTypeface(font);
		txt3.setTypeface(font);
		txt4.setTypeface(font);
		txt5.setTypeface(font);
		txt6.setTypeface(font);
		txt7.setTypeface(font);
		txt8.setTypeface(font);
		txt9.setTypeface(font);
		txt10.setTypeface(font);
		txt11.setTypeface(font);
		txt12.setTypeface(font);
		txt13.setTypeface(font);
		txt14.setTypeface(font);
		
		Bundle bundle = getIntent().getExtras();
		int val_img = bundle.getInt("val_img");
		String val_nome = bundle.getString("val_nome");
		String val_tempo = bundle.getString("val_tempo");
		String val_usuario = bundle.getString("val_usuario");
		int val_tipo = bundle.getInt("val_tipo");
		
		
		txt1.setText(val_nome);
		txt4.setText(val_tempo);
		txt3.setText(val_usuario);
		txt5.setText(val_tempo);
		
		
		/*
		Toast.makeText(Tela04.this, val_nome, Toast.LENGTH_SHORT).show();*/
		
		sw.setFactory(new ViewSwitcher.ViewFactory() {

			@Override
			public View makeView() {
				ImageView myView = new ImageView(getApplicationContext());
				myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
				return myView;
			}
		});
		sw.setImageResource(R.drawable.bolo_de_carne1);
		
			
		switch (val_tipo) {
		case 0:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 1:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 2:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 3:
			sw.setImageResource(val_img);
			txt11.setText(bolo_carne_ingredientes);
			txt12.setText(bolo_carne_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 4:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 5:
			sw.setImageResource(val_img);
			txt11.setText(banoffee_ingredientes);
			txt12.setText(banoffee_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 6:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 7:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 8:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 9:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 10:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 11:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 12:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 13:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 14:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 15:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 16:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 17:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 18:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 19:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 20:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 21:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 22:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 23:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		case 24:
			sw.setImageResource(val_img);
			txt11.setText(bife_a_role_ingredientes);
			txt12.setText(bife_a_role_receita);
			txt6.setText(rendimento[val_tipo]);
			break;
		default:
			sw.setImageResource(R.drawable.bolo_de_carne1);
			break;
		}
		
	}
	
	public void criar_timer(View v) {
		
		Intent it = new Intent(AlarmClock.ACTION_SET_ALARM);
		startActivity(it);
	}

	public void avancar(View v){
		
		int avanca2 = 0, avanca3 = 0;
		
		Bundle bundle = getIntent().getExtras();
		int val_tipo = bundle.getInt("val_tipo");
		int val_img = bundle.getInt("val_img");
		
		switch (val_tipo) {
		case 0:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 1:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 2:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 3:
			avanca2 = R.drawable.bolo_de_carne2;
			avanca3 = R.drawable.bolo_de_carne3;
			break;
		case 4:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 5:
			avanca2 = R.drawable.banoffee2;
			avanca3 = R.drawable.banoffee3;
			break;
		case 6:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 7:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 8:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 9:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 10:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 11:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 12:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 13:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 14:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 15:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 16:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 17:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 18:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 19:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 20:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 21:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 22:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 23:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 24:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		default:
			break;
		}
		
		switch (i) {
		case 1:
			i++;
			sw.setImageResource(avanca2);
			break;

		case 2:
			i++;
			sw.setImageResource(avanca3);
			break;
		case 3:
			i = 1;
			sw.setImageResource(val_img);
		default:
			i = 1;
			sw.setImageResource(val_img);
			break;
		}
	}
	public void voltar(View v){
		Bundle bundle = getIntent().getExtras();
		
		int avanca2 = 0, avanca3 = 0;
		int val_tipo = bundle.getInt("val_tipo");
		int val_img = bundle.getInt("val_img");
		
		switch (val_tipo) {
		case 0:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 1:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 2:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 3:
			avanca2 = R.drawable.bolo_de_carne2;
			avanca3 = R.drawable.bolo_de_carne3;
			break;
		case 4:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 5:
			avanca2 = R.drawable.banoffee2;
			avanca3 = R.drawable.banoffee3;
			break;
		case 6:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 7:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 8:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 9:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 10:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 11:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 12:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 13:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 14:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 15:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 16:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 17:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 18:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 19:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 20:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 21:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 22:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 23:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		case 24:
			avanca2 = R.drawable.bife_a_role2;
			avanca3 = R.drawable.bife_a_role3;
			break;
		default:
			break;
		}
		
		switch (i) {
		case 1:
			i++;
			sw.setImageResource(avanca3);
			break;

		case 2:
			i++;
			sw.setImageResource(avanca2);
			break;
		case 3:
			i = 1;
			sw.setImageResource(val_img);
			break;

		default:
			i = 1;
			sw.setImageResource(val_img);
			break;
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela04, menu);
		return true;
	}

}
