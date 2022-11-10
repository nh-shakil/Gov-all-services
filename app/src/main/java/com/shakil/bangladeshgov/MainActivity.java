package com.shakil.bangladeshgov;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    CardView nid_allinfo,birth_info,prottoyon,passport,bhata,railway,agericulture,surkkha,eadalot,uthor,vumi,bdgov,polic,fireservice;
    WebView video;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nid_allinfo  = findViewById(R.id.nid_allinfo);
        birth_info  = findViewById(R.id.birth_info);
        prottoyon  = findViewById(R.id.prottoyon);
        passport  = findViewById(R.id.passport);
        bhata  = findViewById(R.id.bhata);
        railway  = findViewById(R.id.railway);
        agericulture  = findViewById(R.id.agericulture);
        surkkha  = findViewById(R.id.surkkha);
        eadalot  = findViewById(R.id.eadalot);

        uthor = findViewById(R.id.uthor);
        vumi = findViewById(R.id.vumi);
        bdgov = findViewById(R.id.bdgov);
        polic = findViewById(R.id.polic);
        fireservice = findViewById(R.id.fireservice);
        video = findViewById(R.id.video);


        video.getSettings().setPluginState(WebSettings.PluginState.ON);
        video.setWebChromeClient(new WebChromeClient());
        video.getSettings().setJavaScriptEnabled(true);
        video.getSettings().setAppCacheEnabled(true);
        video.setInitialScale(1);
        video.getSettings().setLoadWithOverviewMode(true);
        video.getSettings().setUseWideViewPort(true);

        video.loadUrl("https://www.youtube.com/embed/VcSpeRyy3bM");


        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                    }
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        mInterstitialAd = null;
                    }
                });
        nid_allinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,NidActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,NidActivity.class);
                startActivity(intent);
            }
        });

        birth_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,BirthActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,BirthActivity.class);
                startActivity(intent);
            }
        });

        prottoyon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,ProttoyonActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,ProttoyonActivity.class);
                startActivity(intent);

            }
        });

        passport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,EpassportActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,EpassportActivity.class);
                startActivity(intent);

            }
        });

        bhata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,BatagovActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,BatagovActivity.class);
                startActivity(intent);

            }
        });

        railway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,RailwayActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,RailwayActivity.class);
                startActivity(intent);

            }
        });

        agericulture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,AgricultureActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,AgricultureActivity.class);
                startActivity(intent);

            }
        });

        surkkha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,ShurkkhaActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,ShurkkhaActivity.class);
                startActivity(intent);

            }
        });

        eadalot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,EadalotActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,EadalotActivity.class);
                startActivity(intent);

            }
        });

        uthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,UthorActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,UthorActivity.class);
                startActivity(intent);

            }
        });

        vumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,VumiActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,VumiActivity.class);
                startActivity(intent);
            }
        });
        bdgov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,BdgovActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,BdgovActivity.class);
                startActivity(intent);

            }
        });

        polic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,PolicActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,PolicActivity.class);
                startActivity(intent);
            }
        });

        fireservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                        }
                    });
                } else {
                    startActivity(new Intent(MainActivity.this,FireserviceActivity.class));
                }
                Intent intent =new Intent(MainActivity.this,FireserviceActivity.class);
                startActivity(intent);
            }
        });
    }
}