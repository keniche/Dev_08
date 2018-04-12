package android.lifeistech.com.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Word pinchos;
    Word gas;
    Word paeria;
    LinearLayout container;
    //TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (LinearLayout) findViewById(R.id.container);

        pinchos = new Word(R.drawable.pinchos_icon, "ピンチョス");
        gas = new Word(R.drawable.gas_icon, "ガスパッチョ");
        paeria = new Word(R.drawable.paeria_icon, "パエリア");
            //TODO:ここで変数の前にクラス名がないのは、それより上で宣言してるから？→多分そう。
        addWord(pinchos);
        addWord(gas);
        addWord(paeria);
    }

    public void addWord(Word word){
        LinearLayout layout = new LinearLayout(this.getApplicationContext());
        layout.setOrientation(LinearLayout.HORIZONTAL);
        //layout.setWeightSum(3);

        TextView nameTextView = new TextView(getApplicationContext());
            //TODO:コンテキスト型の変数？
        nameTextView.setText(word.name);
            // container.addView(nameTextView);
        //nameTextView.setHeight(0);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(word.resID);
        //imageView.setMaxHeight(0);


        layout.addView(imageView);
        layout.addView(nameTextView);

        container.addView(layout);
    }
}


//TODO:画像をフィットさせる！＜https://akira-watson.com/android/imageview_scaletype.html＞