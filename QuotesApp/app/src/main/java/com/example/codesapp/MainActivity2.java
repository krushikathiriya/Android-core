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
        String title = null;

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

                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("Not how long, but how well you have lived is the main thing.");
                QuotesName.add(m10);


                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("If life were predictable it would cease to be life, and be without flavor.");
                QuotesName.add(m11);


                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("The whole secret of a successful life is to find out what is one’s destiny to do, and then do it.");
                QuotesName.add(m12);


                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("In order to write about life first you must live it.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("The big lesson in life, baby, is never be scared of anyone or anything.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("Curiosity about life in all of its aspects, I think, is still the secret of great creative people.");
                QuotesName.add(m15);

                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("You only live once, but if you do it right, once is enough.");
                QuotesName.add(m16);

                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("Many of life’s failures are people who did not realize how close they were to success when they gave up.");
                QuotesName.add(m17);

                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("Never let the fear of striking out keep you from playing the game.");
                QuotesName.add(m18);

                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("Money and success don’t change people; they merely amplify what is already there");
                QuotesName.add(m19);

                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("The purpose of our lives is to be happy.");
                QuotesName.add(m20);

                ModelclassQuotes  m21 = new ModelclassQuotes();
                m21.setQuotes("Get busy living or get busy dying..");
                QuotesName.add(m21);

                ModelclassQuotes  m22 = new ModelclassQuotes();
                m22.setQuotes("You only live once, but if you do it right, once is enough.");
                QuotesName.add(m22);



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

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("Sadness flies away on the wings of time.");
                QuotesName.add(m11);


                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("Don't cry over someone who wouldn't cry over you.");
                QuotesName.add(m12);


                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("ny fool can be happy. It takes a man with real heart to make beauty out of the stuff that makes us weep.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("The word ‘happy’ would lose its meaning if it were not balanced by sadness");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("Tears are words that need to be written");
                QuotesName.add(m15);

                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("Sadness is but a wall between two gardens.");
                QuotesName.add(m16);

                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("It is sad not to love, but it is much sadder not to be able to love.");
                QuotesName.add(m17);

                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("There are two types of people in the world: Those who prefer to be sad among others, and those who prefer to be sad alone");
                QuotesName.add(m18);

                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("Sad hurts but it's a healthy feeling. It is a necessary thing to feel");
                QuotesName.add(m19);

                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("One thing you can't hide is when you're crippled inside");
                QuotesName.add(m20);

                ModelclassQuotes  m21 = new ModelclassQuotes();
                m21.setQuotes("Every life has a measure of sorrow, and sometimes this is what awakens us.");
                QuotesName.add(m21);

                ModelclassQuotes  m22 = new ModelclassQuotes();
                m22.setQuotes("Sadness is also a kind of defense");
                QuotesName.add(m22);


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

                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("My existence is for myself; I do not exist to impress others,.");
                QuotesName.add(m10);


                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("The best way to get someone’s attention is to stop giving them your attention");
                QuotesName.add(m11);


                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("Life is short, don’t waste it on me.");
                QuotesName.add(m12);


                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("You lose your importance in their life when you give lots of importance to them.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("My attitude replies to you if your ego speaks with me");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("Quit talking to me if you don’t like my attitude.");
                QuotesName.add(m15);

                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("My life, my attitude");
                QuotesName.add(m16);

                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("Maybe I am not perfect, but I am always me");
                QuotesName.add(m17);

                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("Make sure that you are perfect if you are going to judge me");
                QuotesName.add(m18);

                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("I’m not a WhatsApp status; I don’t mind if you don’t like me.");
                QuotesName.add(m19);

                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("A man who has not passed through the inferno of his passions has never overcome them");
                QuotesName.add(m20);

                ModelclassQuotes  m21 = new ModelclassQuotes();
                m21.setQuotes("When anger rises, think of the consequences.");
                QuotesName.add(m21);

                ModelclassQuotes  m22 = new ModelclassQuotes();
                m22.setQuotes("For every minute you remain angry, you give up sixty seconds of peace of mind.");
                QuotesName.add(m22);
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

                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("close, but no cigar..");
                QuotesName.add(m10);


                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("turn over a new leaf.");
                QuotesName.add(m11);


                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("Affect vs. Effect. Affect is a verb meaning to influence");
                QuotesName.add(m12);


                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("The most confused we ever get is when we're trying to convince our heads of something our heart knows is a lie");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("Good. Be confused. Confusion is where inspiration comes from.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("People don't expect too much from literature. They just want to know they're not alone with being confused.");
                QuotesName.add(m15);

                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("Logic of a madman is a sane man’s confusion");
                QuotesName.add(m16);

                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("With great power often comes great confusion");
                QuotesName.add(m17);

                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("Confusion is a sign of intelligence; only fools are crystal clear.");
                QuotesName.add(m18);

                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("Sensuality is allowing your brilliance and confusion to coexist");
                QuotesName.add(m19);

                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("We often confuse what we wish for with what is");
                QuotesName.add(m20);

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

                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("As he read, I fell in love the way you fall asleep: slowly, and then all at once.");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("Loved you yesterday, love you still, always have, always will.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("I love you not only for what you are, but for what I am when I am with you. I love you not only for what you have made of yourself, but for what you are making of me. I love you for the part of me that you bring out.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("The real lover is a man who can thrill you by kissing your forehead or smiling into your eyes or just staring into space.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("In all the world, there is no heart for me like yours. In all the world, there is no love for you like mine.");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("I’ll be loving you, always with a love that’s true");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("Thinking of you keeps me awake. Dreaming of you keeps me asleep. Being with you keeps me alive.");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("I need you like a heart needs a beat.");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("If I know what love is, it is because of you.");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow.");
                QuotesName.add(m20);

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


                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("Future's like an older brother to me, and Thug's more like a brother my age.");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("There is no success you can celebrate more than the success of a brother..");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("I had a brother who was my savior, made my childhood bearable.");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("My brother was a lifeguard in a car wash.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("My brother was my first guru who introduced me to spiritualism at a very young age. He later even enrolled me into Ramakrishna Mission.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("The men who learn endurance, are they who call the whole world, brother.");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("Your brother is always the first male friend you will have in your life .Ritu Ghatourey");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("Who needs superheroes when you have a brother.");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("When brothers agree no fortress is so strong as their common life.");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("Brothers are playmates in the beginning and best friends for life.");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("My little brother played drums so we had a drum set over at my house Synyster Gates");
                QuotesName.add(m20);
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

                ModelclassQuotes m11 = new ModelclassQuotes();
                m11.setQuotes("One book, one pen, one child and one teacher can change the world.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("A teacher affects eternity; he can never tell where his influence stops.");
                QuotesName.add(m12);


                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("The beautiful thing about learning is that no one can take it away from you.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("How wonderful it is that nobody need wait a single moment before starting to improve the world.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("May your passion for teaching continue to shine.");
                QuotesName.add(m15);
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

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("Let us be grateful to the people who make us happy; they are the charming gardeners who make our souls blossom.");
                QuotesName.add(m11);


                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("Lots of people want to ride with you in the limo, but what you want is someone who will take the bus with you when the limo breaks down.");
                QuotesName.add(m12);


                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("In the sweetness of friendship let there be laughter, for in the dew of little things the heart finds its morning and is refreshed.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("It’s not what we have in life, but who we have in our life that matters.");
                QuotesName.add(m14);
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

            else if (title.equals("Attitude")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("You are never too old to set another goal or dream a new dream");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("I don’t think of all the misery but of the beauty that still remains.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("When a happy person comes into the room, it is as if another candle has been lit.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("Optimism is the faith that leads to achievement; nothing can be done without hope.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("When a happy person comes into the room, it is as if another candle has been lit.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Attitude and enthusiasm play a big part in my life. I get excited about the things that inspire me. I also believe in laughing and having a good time.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("Always bear in mind that your own resolution to succeed is more important than any other one thing.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("Optimism is a happiness magnet. If you stay positive, good things and good people will be drawn to you.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("You always pass failure on the way to success.");
                QuotesName.add(m9);

                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("Keep your face always toward the sunshine—and shadows will fall behind you.");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("Perpetual optimism is a force multiplier.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("All your dreams can come true f you have the courage to purse them.");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("Your patience when you have nothing and your attitude when you have everything..");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("If you look the right way, you can see that the whole world is a garden.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("Live life to the fullest, and focus on the positive.");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("A positive attitude may not solve all our problems but that is the only option we have if we want to get out of problems.");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("The only disability in life is a bad attitude.");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("To be an overachiever you have to be an over-believer.");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("With a positive attitude it is possible to turn situations of failure into success.");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("With a positive attitude, the world is your oyster. Without it, your world will be filled with ill fate and unfortunate circumstances.");
                QuotesName.add(m20);

            }

            else if (title.equals("Alone")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Alone we can do so little together we can do so much.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("I restore myself when I'm alone");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("If you are lonely when you're alone, you are in bad company");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("To live alone is the fate of all great souls..");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("It is far better to be alone, than to be in bad company..");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Alone with my thoughts works for me.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("Alone with my thoughts is my happy place.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("Alone time feeds the soul like nothing else can.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("Being comfortable on your own is a superpower.");
                QuotesName.add(m9);


                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("You can always be yourself when you're on your own.");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("Alone time is a gift.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("Everybody needs a bit of me time now and again.");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("Finding yourself may be lonely work, but the rewards are exponential.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("Being lonely for a while is preferable to being with someone who makes you feel all alone.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("Sometimes the path you need to walk is lonely, but the destination will be well worth the journey.");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("Better to be with no one than to be with the wrong one.");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("I’m learning a lot about myself being alone");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("Happiness is being alone with your own thoughts.");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("If you want to be strong, learn to enjoy being alone");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("I enjoy being alone, my soul is at peace in the silence");
                QuotesName.add(m20);
            }

            else if (title.equals("Confidence")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("No one can make you feel inferior without your consent.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("I can be changed by what happens to me. But I refuse to be reduced by it.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("You gain strength, courage, and confidence by every experience in which you really stop to look fear in the face. You are able to say to yourself, 'I have lived through this horror. I can take the next thing that comes along.' You must do the thing you think you cannot do.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Believe in your infinite potential. Your only limitations are those you set upon yourself..");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Accept who you are and revel in it.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("The eyes of others our prisons; their thoughts our cages.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("Never dull your shine for somebody else.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("I do not care so much what I am to others as I care what I am to myself");
                QuotesName.add(m9);


                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("What could we accomplish if we knew we could not fail?");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("And no one will listen to us until we listen to ourselves.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("With realization of one's own potential and self-confidence in one's ability, one can build a better world.");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("Do not let what you cannot do interfere with what you can do.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("You're never as good as everyone tells you when you win, and you're never as bad as they say when you lose.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("Courage is resistance to fear, mastery of fear, not absence of fear");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("It is best to act with confidence, no matter how little right you have to it.");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("Remember that wherever your heart is, there you will find your treasure.");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("Make the most of yourself, for that is all there is of you.");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("Accept who you are and revel in it.");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("You wouldn't worry so much about what others think of you if you realized how seldom they do.");
                QuotesName.add(m20);
            }

            else if (title.equals("Inspiration")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("When you have a dream, you've got to grab it and never let go..");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("Nothing is impossible");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("There is nothing impossible to they who will try.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("The bad news is time flies.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Life has got all those twists and turns.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Keep your face always toward the sunshine, and shadows will fall behind you.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("Success is not final, failure is not fatal it is the courage to continue that counts");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("You define your own life,Don't let other people write your script.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("You are never too old to set another goal or to dream a new dream.");
                QuotesName.add(m9);


                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("Spread love everywhere you go.");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("Do not allow people to dim your shine because they are blinded. Tell them to put some sunglasses on.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("You don't always need a plan. Sometimes you just need to breathe, trust, let go and see what happens..");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("You can be everything. You can be the infinite amount of things that people are.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("What lies behind you and what lies in front of you, pales in comparison to what lies inside of you.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("No matter what people tell you, words and ideas can change the world.");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("It is during our darkest moments that we must focus to see the light.");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("Not having the best situation, but seeing the best in your situation is the key to happiness.");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("Weaknesses are just strengths in the wrong environment.");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("In a gentle way, you can shake the world.");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("I care about decency and humanity and kindness. Kindness today is an act of rebellion..");
                QuotesName.add(m20);
            }

            else if (title.equals("Life")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("The purpose of our lives is to be happy.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("Life is what happens when you're busy making other plans");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Get busy living or get busy dying.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("You only live once, but if you do it right, once is enough.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Many of life’s failures are people who did not realize how close they were to success when they gave up.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("If you want to live a happy life, tie it to a goal, not to people or things.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("Never let the fear of striking out keep you from playing the game.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("You define your own life,Don't let other people write your script.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("You never really learn much from hearing yourself speak.");
                QuotesName.add(m9);


                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("Life imposes things on you that you can’t control, but you still have the choice of how you’re going to live through this");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("Life is never easy. There is work to be done and obligations to be met – obligations to truth, to justice, and to liberty.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("Live for each second without hesitation.");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("Life is like riding a bicycle. To keep your balance, you must keep moving.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("Life is really simple, but men insist on making it complicated..");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("Life is a succession of lessons which must be lived to be understood.");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("Life is like a coin. You can spend it any way you wish, but you only spend it once..");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("Life is ten percent what happens to you and ninety percent how you respond to it..");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("Life is a flower of which love is the honey..");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("Keep smiling, because life is a beautiful thing and there’s so much to smile about.");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("Good friends, good books, and a sleepy conscience: this is the ideal life.");
                QuotesName.add(m20);
            }

            else if (title.equals("Beautiful")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Life is beautiful and so are you.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("The purpose of our lives is to be happy.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Life is as beautiful as the stars and the moon except when it is covered by the clouds of sadness and pain.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("Life is full of beauty. Notice it. Notice the bumble bee, the small child, and the smiling faces. Smell the rain, and feel the wind. Live your life to the fullest potential, and fight for your dreams.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("When one has a grateful heart, life is so beautiful.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("If roses could talk, they would not boast of their beauty, because they know that they have always been beautiful.");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("I think whenever there’s potential for beauty, beauty can be found. And everything has potential for beauty.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("At some point, the girl who never thinks she is pretty, will believe she is. And she is beautiful.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("Forgive yourself for believing that you're anything less than beautiful.");
                QuotesName.add(m9);


                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("You are beautiful when you are happy.");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("You are worthy of love and respect. You are beautiful, gifted, and intelligent. Don't let the storm make you forget it.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("Tall, thin, curvy, short – whatever you are, you are beautiful.");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("Sometimes people are beautiful. Not in looks. Not in what they say. Just in what they are.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("You are good enough, smart enough, beautiful enough, strong enough.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("You are beautiful because of the light you carry inside you. You are beautiful because you say you are, and you hold yourself that way.");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("You are beautiful. You are strong. You are worth it. You are loved.");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("You are more powerful than you know; you are beautiful just as you are.");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("You are beautiful just the way you are.");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("You are beautiful. Your beauty, just like your capacity for life, happiness, and success, is immeasurable.");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("You are a beautiful and wonderful soul. Recognize and illuminate it.");
                QuotesName.add(m20);
            }

            else if (title.equals("Dream")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("A dream doesn't become reality through magic; it takes sweat, determination and hard work.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("The future belongs to those who believe in the beauty of their dreams.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("All our dreams can come true,if we have the courage to pursue them.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("Who looks outside, dreams; who looks inside, awakes.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("Consult not your fears but your hopes and your dreams.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Never give up on your dreams, no matter how painful and difficult your journey is. ");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("You have to dream before your dreams can come true. ");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("Keep your dreams alive.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("Life is full of beauty. ");
                QuotesName.add(m9);


                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("The best way to make your dreams come true is to wake up.");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("Who looks outside, dreams; who looks inside, awakes.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("We cannot change anything until we accept it. Condemnation does not liberate, it oppresses.");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("The future belongs to those who believe in the beauty of their dreams.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("All our dreams can come true, if we have the courage to pursue them.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("Dream as if you'll live forever. Live as if you'll die today.");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("A dream you dream alone is only a dream. A dream you dream together is reality.");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("Dreams will get you nowhere, a good kick in the pants will take you a long way.");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("Perhaps life is just that... a dream and a fear.");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("The more you can dream, the more you can do.");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("I close my eyes, then I drift away, into the magic night I softly say. A silent prayer, like dreamers do, then I fall asleep to dream my dreams of you.");
                QuotesName.add(m20);
            }

            else if (title.equals("Motivation")) {
                ModelclassQuotes m1 = new ModelclassQuotes();
                m1.setQuotes("Just one small positive thought in the morning can change your whole day.");
                QuotesName.add(m1);

                ModelclassQuotes m2 = new ModelclassQuotes();
                m2.setQuotes("Opportunities don't happen, you create them.");
                QuotesName.add(m2);

                ModelclassQuotes m3 = new ModelclassQuotes();
                m3.setQuotes("Love your family, work super hard, live your passion.");
                QuotesName.add(m3);

                ModelclassQuotes m4 = new ModelclassQuotes();
                m4.setQuotes("It is never too late to be what you might have been.");
                QuotesName.add(m4);

                ModelclassQuotes m5 = new ModelclassQuotes();
                m5.setQuotes("It is better to fail in originality than to succeed in imitation.");
                QuotesName.add(m5);

                ModelclassQuotes m6 = new ModelclassQuotes();
                m6.setQuotes("Success usually comes to those who are too busy looking for it. ");
                QuotesName.add(m6);

                ModelclassQuotes m7 = new ModelclassQuotes();
                m7.setQuotes("The pessimist sees difficulty in every opportunity. The optimist sees opportunity in every difficulty.");
                QuotesName.add(m7);

                ModelclassQuotes m8 = new ModelclassQuotes();
                m8.setQuotes("To know how much there is to know is the beginning of learning to live.");
                QuotesName.add(m8);

                ModelclassQuotes m9 = new ModelclassQuotes();
                m9.setQuotes("Concentrate all your thoughts upon the work in hand. The sun's rays do not burn until brought to a focus. ");
                QuotesName.add(m9);


                ModelclassQuotes  m10 = new ModelclassQuotes();
                m10.setQuotes("Education is the most powerful weapon which you can use to change the world.");
                QuotesName.add(m10);

                ModelclassQuotes  m11 = new ModelclassQuotes();
                m11.setQuotes("The most difficult thing is the decision to act, the rest is merely tenacity.");
                QuotesName.add(m11);

                ModelclassQuotes  m12 = new ModelclassQuotes();
                m12.setQuotes("The elevator to success is out of order. You’ll have to use the stairs, one step at a time.");
                QuotesName.add(m12);

                ModelclassQuotes  m13 = new ModelclassQuotes();
                m13.setQuotes("Be a positive energy trampoline – absorb what you need and rebound more back.");
                QuotesName.add(m13);


                ModelclassQuotes  m14 = new ModelclassQuotes();
                m14.setQuotes("Life is like a sewer… what you get out of it depends on what you put into it.");
                QuotesName.add(m14);


                ModelclassQuotes  m15 = new ModelclassQuotes();
                m15.setQuotes("Just one small positive thought in the morning can change your whole day.");
                QuotesName.add(m15);


                ModelclassQuotes  m16 = new ModelclassQuotes();
                m16.setQuotes("Opportunities don't happen, you create them.");
                QuotesName.add(m16);


                ModelclassQuotes  m17 = new ModelclassQuotes();
                m17.setQuotes("Love your family, work super hard, live your passion.");
                QuotesName.add(m17);


                ModelclassQuotes  m18 = new ModelclassQuotes();
                m18.setQuotes("Don't let someone else's opinion of you become your reality.");
                QuotesName.add(m18);


                ModelclassQuotes  m19 = new ModelclassQuotes();
                m19.setQuotes("Do what you can, with what you have, where you are.");
                QuotesName.add(m19);


                ModelclassQuotes  m20 = new ModelclassQuotes();
                m20.setQuotes("One of the differences between some successful and unsuccessful people is that one group is full of doers, while the other is full of wishers.");
                QuotesName.add(m20);
            }
        }
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.VERTICAL,false);
        rcv.setLayoutManager(manager);

    QuotesAdpeter adpeter = new QuotesAdpeter(MainActivity2.this,QuotesName);
    rcv.setAdapter(adpeter);
    }


}