
package com.example.alex.playkidsmusic;
/**
 * Autor: Alex Silva.
 * Disciplina: Programação Android
 * Professor: Anderson
 * Faculdade: Estácio.
 * Descripitions:
 * Create date: 28/11/18
 * mail:alexdomingos13@icloud.com
 */

/*Importes utilizado no projeto apis plugins etc.*/
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity  extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Teste Progressbar.


    public void play(View v) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.test);
            player = MediaPlayer.create(this, R.raw.test2);

            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }

        player.start();
        Toast.makeText(this, "Vamos lá, heheheh!!!    : ) ", Toast.LENGTH_SHORT).show();

    }

    public void pause(View v) {
        if (player != null) {
            player.pause();
        Toast.makeText(this, ":`( ", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "para não vamos se divertir : - ) ", Toast.LENGTH_SHORT).show();
        }
    }

    public void stop(View v) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
            Toast.makeText(this, "MediaPlayer Kids : ) ", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Obrigado por utilizar nosso aplicativo", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Desenvolvido por Agência Was", Toast.LENGTH_SHORT).show();



        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}

