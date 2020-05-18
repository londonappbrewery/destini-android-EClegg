package com.londonappbrewery.destini;

public class Story {

    private StoryStep mStartStoryStep;
    private StoryStep mCurrentStoryStep;

    public Story() {
        StoryStep step6 = new StoryStep(R.string.T6_End,true,null,null,null,null);
        StoryStep step5 = new StoryStep(R.string.T5_End,true,null,null,null,null);
        StoryStep step4 = new StoryStep(R.string.T4_End,true,null,null,null,null);

        StoryStep step3 = new StoryStep(R.string.T3_Story,false,R.string.T3_Ans1,R.string.T3_Ans2,step6,step5);
        StoryStep step2 = new StoryStep(R.string.T2_Story,false,R.string.T2_Ans1,R.string.T2_Ans2,step3,step4);
        StoryStep step1 = new StoryStep(R.string.T1_Story,false,R.string.T1_Ans1,R.string.T1_Ans2,step3,step2);

        mStartStoryStep = step1;
        mCurrentStoryStep = step1;
    }

    public StoryStep getCurrentStoryStep() {
        return mCurrentStoryStep;
    }

    public StoryStep resetStory() {
        mCurrentStoryStep = mStartStoryStep;
        return mCurrentStoryStep;
    }

}
