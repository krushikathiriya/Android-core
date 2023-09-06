package com.example.codesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView rcv;

    TextView txt;
    ArrayList<ModelclassQuotes> QuotesName = new ArrayList<ModelclassQuotes>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initview();
    }

    private void initview() {
        String title;

        txt = findViewById(R.id.txt);
        rcv = findViewById(R.id.rcv);

        if (getIntent()!=null)
        {
            title = getIntent().getStringExtra("Quotes");
            txt.setText(title);

            if (title.equals("Happy"))
            {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Success is getting what you want,Happiness is wanting what you get");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("The best way to cheer yourself up is to try to cheer somebody else up.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("The habit of being happy enables one to be freed, or largely freed, from the domenation of outworld condition.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("The purpose of our lives is to happy.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("The purpose of our lives is to happy.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Happiness is the best makeup");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("The mere sense of living is happiness enough");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes(" The only think that will make you happy with who are you.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("Happiness is letting go of what you think your life is supposed to look like.");
                QuotesName.add(m9);

            } else if (title.equals("Sad"))
            {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("It’s amazing how someone can break your heart and you can still love them with all the little pieces.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("Never feel regret for your own decisions. If, you will not respect your own decisions, who else will");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("I always like walking in the rain, so no one can see me crying.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("I know how to love you, but not how to stop loving you.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Sadness flies away on the wings of time.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("There are years that ask questions and years that answer.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("Be strong now because things will get better. It might be stormy now, but it can’t rain forever");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("I do believe that if you haven’t learnt about sadness, you cannot appreciate happiness");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("Maybe we all have darkness inside of us and some of us are better at dealing with it than others.");
                QuotesName.add(m9);

                ModelclassQuotes m10 = new ModelclassQuotes();
                m10.setQuotes("Don’t cry because it’s over, smile because it happened.");
                QuotesName.add(m10);

            } else if (title.equals("Engry")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("A man that studieth revenge keeps his own wounds green.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("I know of no more disagreeable situation than to be left feeling generally angry without anybody in particular to be angry at");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("When anger rises, think of the consequences.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("The best answer to anger is silence.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("A grouch escapes so many little annoyances that it almost pays to be one.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes(" Anger is never without a reason, but seldom with a good one.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes(" When one is in a good sound rage, it is astonishing how calm one can be.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("It is the growling man who lives a dog’s life.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes(" A man in a passion rides a horse that runs away with him.");
                QuotesName.add(m9);
            }

            else if (title.equals("Confused")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Your intellect may be confused, but your emotions will never lie to you.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("Sometimes hate is just confused love!");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("We often confuse what we wish for with what is");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("Whenever I'm confused about something, I ask God to reveal the answers to my questions, and he does.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Anyone who isn't confused really doesn't understand the situation.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes(" Confusion is the mother of new learning.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("Confusion shows something inside you is waiting to be explored and discovered");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("A confused mind tends to be the most creative.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("If you can’t convince them, confuse them.");
                QuotesName.add(m9);
            }

            else if (title.equals("Love")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("If I know what love is, it is because of you.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("Grow old along with me; the best is yet to be.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Love is like the wind, you can’t see it but you can feel it");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("My wish is that you may be loved to the point of madness.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Love is the strange bewilderment which overtakes one person on account of another person");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("This has been my life; I found it worth living.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("Let the beauty of what you love be what you do.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("Only true love can fuel the hard work that awaits you");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("I have decided to stick to love; hate is too great a burden to bear.");
                QuotesName.add(m9);
            }

            else if (title.equals("Brother")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Brothers aren’t simply close; brothers are knit together.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("Brothers make you laugh and keep your secrets");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Half the time when brothers wrestle, it’s just an excuse to hug each other.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("Brothers are what best friends can never be.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Being his real brother I could feel I live in his shadows, but I never have and I do not now. I live in his glow.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("When you deal with your brother, be pleasant, but get a witness.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("Never make a companion equal to a brother.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("A sibling is the lens through which you see your childhood.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("Nothing can stop me from loving my brother.");
                QuotesName.add(m9);
            }

            else if (title.equals("Teacher")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Behind every successful person, there is an inspiring teacher.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("A teacher's influence is eternal.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("A teacher takes a hand, opens a mind, and touches a heart.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("Teaching is the greatest act of optimism.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Thank you for helping us become the best version of ourselves");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("One child, one teacher, one book, one pen can change the world");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("If you can read this, thank a teacher.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("Education is a progressive discovery of our own ignorance.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("In the world of education, teachers are the guiding stars.");
                QuotesName.add(m9);

                ModelclassQuotes m10 = new ModelclassQuotes();
                m10.setQuotes("You are the best teacher a student could ask for");
                QuotesName.add(m10);
            }

            else if (title.equals("Friendship")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("A friend is one soul abiding in two bodies");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("My best friend is the one who brings out the best in me");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Friendship is the only cement that will ever hold the world together.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("A day without a friend is like a pot without a single drop of honey left inside");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("The best mirror is an old friend.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Remember that life's most valuable antiques are dear old friends");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("True friends are great riches");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("A true friend is for ever a friend.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("To friendship every burden's light.");
                QuotesName.add(m9);

                ModelclassQuotes m10 = new ModelclassQuotes();
                m10.setQuotes("A faithful friend loves to the end");
                QuotesName.add(m10);
            }

            else if (title.equals("Education")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("The more that you read, the more things you will know, the more that you learn, the more places you’ll go");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("Education is one thing no one can take away from you.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Education is the key that unlocks the golden door to freedom.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("Education’s purpose is to replace an empty mind with an open one.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Education is what remains after one has forgotten what one has learned in school");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Education is not preparation for life; education is life itself.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("The aim of education is the knowledge, not of facts, but of values.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("Education is the vaccine of violence.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("A child without education is like a bird without wings.");
                QuotesName.add(m9);

                ModelclassQuotes m10 = new ModelclassQuotes();
                m10.setQuotes("The goal of education is the advancement of knowledge and the dissemination of truth.");
                QuotesName.add(m10);
            }

            else if (title.equals("Positive")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Success is not final; failure is not fatal: It is the courage to continue that counts.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("It is better to fail in originality than to succeed in imitation.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("The road to success and the road to failure are almost exactly the same.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("Life is short, and it is here to be lived");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("if you risk nothing, then you risk everything.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Don't waste a minute not being happy.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("The aim of education is the knowledge, not of facts, but of values.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("Education is the vaccine of violence.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("Think like a queen.");
                QuotesName.add(m9);

                ModelclassQuotes m10 = new ModelclassQuotes();
                m10.setQuotes("Some women choose to follow men, and some choose to follow their dreams.");
                QuotesName.add(m10);
            }

            else if (title.equals("Money")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Start saving and investing early in the life.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("All the money in the world can't buy you back good health.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Making money is art and working is art and good business is the best art. ");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("To get rich, you have to be making money while you're asleep.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Never spend your money before you have it.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Money is not god,but even not lesser than god");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("To get rich, you have to be making money while you’re asleep.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("If you’re saving, you’re succeeding");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("For many money is wealth, for me health is wealth.”");
                QuotesName.add(m9);

                ModelclassQuotes m10 = new ModelclassQuotes();
                m10.setQuotes("Savings.");
                QuotesName.add(m10);
            }

            else if (title.equals("Nature")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Nature is not a place to visit, it is home.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("Nature is the source of all true knowledge.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Choose only one master—nature");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("Time spent amongst trees is never wasted time.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Nature is pleased with simplicity.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Storms make trees take deeper roots.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("Nature always wears the colors of the spirit.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("ray skies are just clouds passing over.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("Nature always wears the colors of the spirit.");
                QuotesName.add(m9);

                ModelclassQuotes m10 = new ModelclassQuotes();
                m10.setQuotes("We can never have enough of nature.");
                QuotesName.add(m10);
            }
        }
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.VERTICAL,false);
        rcv.setLayoutManager(manager);

    QuotesAdpeter adpeter = new QuotesAdpeter(MainActivity2.this,QuotesName);
    rcv.setAdapter(adpeter);
    }


}