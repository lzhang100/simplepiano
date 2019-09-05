package com.example.simplepiano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Queue;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    MediaPlayer mediaPlayer;
    Piano piano;
    Song songBook;
    AudioManager audio;
    int maxVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        piano = new Piano();
        songBook = new Song();

        //Set the media volume to maxVolume when app is first launched
        audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        maxVolume = (int) audio.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        audio.setStreamVolume(AudioManager.STREAM_MUSIC, (int) (maxVolume * 0.85f), 0);

        //Button to click to change piano modes: acoustic and creepy
        final Button modeButton = (Button) findViewById(R.id.modeButton);

        //Set up the onclicklistener on that view
        modeButton.setOnClickListener(new View.OnClickListener() {

            float creepyPercent = 0.40f;
            int fortyVolume = (int) (maxVolume * creepyPercent);

            @Override
            public void onClick(View v) {
                piano.setMode();
                if (piano.getMode() == 1) {
                    modeButton.setText("Acoustic");
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC, (int) (maxVolume * 0.85f), 0);
                } else {
                    modeButton.setText("Creepy");
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC, fortyVolume, 0);
                }
            }
        });
        //Find the button for the c note
        Button c = (Button) findViewById(R.id.c);

        //Set up the onclicklistener on that view
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button c_sharp = (Button) findViewById(R.id.c_sharp);
                //c_sharp.bringToFront();
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.c));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }
        });


        //Find the button for the c_sharp note
        Button c_sharp = (Button) findViewById(R.id.c_sharp);

        //Set up the onclicklistener on that view
        c_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.c_sharp));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }

        });

        //Find the button for the d note
        Button d = (Button) findViewById(R.id.d);

        //Set up the onclicklistener on that view
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.d));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }
        });


        //Find the button for the d_sharp note
        Button d_sharp = (Button) findViewById(R.id.d_sharp);

        //Set up the onlicklistener on that view
        d_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.d_sharp));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }
        });


        //Find the button for the e note
        Button e = (Button) findViewById(R.id.e);

        //Set up the onclicklistener on that view
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.e));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        //Find the button for the f note
        Button f = (Button) findViewById(R.id.f);

        //Set up the onlicklistener on that view
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.f));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }
        });


        //Find the button for the f_sharp note
        Button f_sharp = (Button) findViewById(R.id.f_sharp);

        //Set up the onclicklistener on that view
        f_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.f_sharp));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }
        });


        //Find the button for the g note
        Button g = (Button) findViewById(R.id.g);

        //Set up the onclicklistener on that view
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.g));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }
        });


        //Find the button for the g_sharp note
        Button g_sharp = (Button) findViewById(R.id.g_sharp);

        //Set up the onclicklistener on that view
        g_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.g_sharp));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }
        });


        //Find the button for the a note
        Button a = (Button) findViewById(R.id.a);

        //Set up the onclicklistener on that view
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.a));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });


        //Find the button for the a_sharp note
        Button a_sharp = (Button) findViewById(R.id.a_sharp);

        //Set up the onclicklistener on that view
        a_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.a_sharp));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }
        });


        //Find the button for the b note
        Button b = (Button) findViewById(R.id.b);

        //Set up the onclicklistener on that view
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, piano.getPianoKey(R.id.b));
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });
            }
        });

    }

    //Popup Menu too choose a song
    public void chooseSong(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    //Display a song notes when a song is clicked in the menu
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.item1:
                displaySong(1, "Mary had a little lamb");
                return true;
            case R.id.item2:
                displaySong(2, "Jingle Bells");
                return true;
            case R.id.item3:
                displaySong(3, "Old MacDonald");
                return true;
            default:
                return false;
        }
    }

    public void displaySong(int songNumber, String songTitle) {
        TextView songView = (TextView) findViewById(R.id.song);
        String songText = "";
        Queue<Notes> song;
        int songLength;
        Queue<Notes> songHolder;
        Notes notes;

        song = songBook.getSong(songNumber);
        songHolder = new LinkedList<>(song);

        songText = songText + songTitle + "\n";
        songLength = songHolder.size();

        for (int i = 0; i < songLength; i++) {
            notes = songHolder.remove();

            if (notes.getSpace()) {
                songText = songText + "  ";
            }

            songText = songText + notes.getNote() + " ";

            if (notes.getEndLine()) {
                songText = songText + "\n";
            }
        }

        songView.setText(songText);
        songView.setVisibility(View.VISIBLE);
    }
}
