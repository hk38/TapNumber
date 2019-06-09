package android.lifeistech.tapnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // ランダムな4桁を格納する配列
    int[] hairetu = new int[4];
    // 乱数を生成する変数
    Random rnd = new Random();
    // 乱数の文字列を格納する変数
    String mondai;
    // 正解した文字数をカウントする変数
    int seikai = 0;
    // 表示するTextViewと結びつける変数
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextViewを結びつける
        textView = findViewById(R.id.textView);
        // 開始のメソッドを呼び出す
        start();
    }

    // 開始時の処理
    public void start(){
        // 配列の各桁に乱数を入れる
        hairetu[0] = rnd.nextInt(4) + 1;
        hairetu[1] = rnd.nextInt(4) + 1;
        hairetu[2] = rnd.nextInt(4) + 1;
        hairetu[3] = rnd.nextInt(4) + 1;

        // 各桁を結合して文字列にする
        mondai = Integer.toString(hairetu[0]) + Integer.toString(hairetu[1]) + Integer.toString(hairetu[2]) + Integer.toString(hairetu[3]);
        // TextViewに表示
        textView.setText(mondai);
        // 正解文字数を0にセット
        seikai = 0;

    }

    // 1を押した時の動作
    public void number1(View v){
        // 出題中の文字が1で合っているとき
        if(hairetu[seikai] == 1){
            // 文字列の先頭を切り取る
            mondai = mondai.substring(1);
            // 文字列を表示
            textView.setText(mondai);
            // 正解した文字数を増やす
            seikai = seikai + 1;
        }else{
            // 不正解を表示
            Toast.makeText(this, "数字が違います", Toast.LENGTH_LONG).show();
        }

        // 全桁正解した場合
        if(seikai == 4){
            // 再度初めから
            start();
        }
    }

    // 以下，2，3，4で同様の処理

    public void number2(View v){
        if(hairetu[seikai] == 2){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
        }else{
            Toast.makeText(this, "数字が違います", Toast.LENGTH_LONG).show();
        }

        if(seikai == 4){
            start();
        }
    }

    public void number3(View v){
        if(hairetu[seikai] == 3){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
        }else{
            Toast.makeText(this, "数字が違います", Toast.LENGTH_LONG).show();
        }

        if(seikai == 4){
            start();
        }
    }

    public void number4(View v){
        if(hairetu[seikai] == 4){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
        }else{
            Toast.makeText(this, "数字が違います", Toast.LENGTH_LONG).show();
        }

        if(seikai == 4){
            start();
        }
    }
}
