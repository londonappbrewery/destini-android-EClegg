package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button   mButtonTop;
    Button   mButtonBottom;

    Story mStory = new Story();
    StoryStep mCurrentStoryStep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNextStoryStep("A1");
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNextStoryStep("A2");
            }
        });

        // initialise and start the story
        resetStory();

    } // on Create

    private void resetStory() {
        mCurrentStoryStep = mStory.resetStory();
        mStoryTextView.setText(mCurrentStoryStep.getStoryTextResourceID());
        if (mCurrentStoryStep.isEndPoint()) {
            // End Point - hide the buttons
            mButtonTop.setVisibility(View.INVISIBLE);
            mButtonBottom.setVisibility(View.INVISIBLE);
        } else {
            mButtonTop.setVisibility(View.VISIBLE);
            mButtonBottom.setVisibility(View.VISIBLE);
            mButtonTop.setText(mCurrentStoryStep.getAnswer1TextResourceID());
            mButtonBottom.setText(mCurrentStoryStep.getAnswer2TextResourceID());
        }
    } // resetStory

    private void setNextStoryStep(String answer) {
        if (answer.equals("A1")) {
            mCurrentStoryStep = mCurrentStoryStep.getAnswer1NextStoryStep();
        } else {
            mCurrentStoryStep = mCurrentStoryStep.getAnswer2NextStoryStep();
        }
        mStoryTextView.setText(mCurrentStoryStep.getStoryTextResourceID());
        if (mCurrentStoryStep.isEndPoint()) {
            // End Point - hide the buttons
            mButtonTop.setVisibility(View.INVISIBLE);
            mButtonBottom.setVisibility(View.INVISIBLE);
        } else {
            mButtonTop.setVisibility(View.VISIBLE);
            mButtonBottom.setVisibility(View.VISIBLE);
            mButtonTop.setText(mCurrentStoryStep.getAnswer1TextResourceID());
            mButtonBottom.setText(mCurrentStoryStep.getAnswer2TextResourceID());
        }
    } // setNextStory
    
}
