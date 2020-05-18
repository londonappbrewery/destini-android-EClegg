package com.londonappbrewery.destini;

public class StoryStep {

    private Integer mStoryTextResourceID;
    private boolean mIsEndPoint;
    private Integer mAnswer1TextResourceID;
    private Integer mAnswer2TextResourceID;
    private StoryStep mAnswer1NextStoryStep;
    private StoryStep mAnswer2NextStoryStep;


    public StoryStep(Integer storyTextResourceID,
                     boolean isEndPoint,
                     Integer answer1TextResourceID,
                     Integer answer2TextResourceID,
                     StoryStep answer1NextStoryStep,
                     StoryStep answer2NextStoryStep) {
        mStoryTextResourceID = storyTextResourceID;
        mIsEndPoint = isEndPoint;
        mAnswer1TextResourceID = answer1TextResourceID;
        mAnswer2TextResourceID = answer2TextResourceID;
        mAnswer1NextStoryStep = answer1NextStoryStep;
        mAnswer2NextStoryStep = answer2NextStoryStep;
    }

    public Integer getStoryTextResourceID() {
        return mStoryTextResourceID;
    }

    public void setStoryTextResourceID(Integer storyTextResourceID) {
        mStoryTextResourceID = storyTextResourceID;
    }

    public boolean isEndPoint() {
        return mIsEndPoint;
    }

    public void setEndPoint(boolean isEndPoint) {
        mIsEndPoint = isEndPoint;
    }

    public Integer getAnswer1TextResourceID() {
        return mAnswer1TextResourceID;
    }

    public void setAnswer1TextResourceID(Integer answer1TextResourceID) {
        mAnswer1TextResourceID = answer1TextResourceID;
    }

    public Integer getAnswer2TextResourceID() {
        return mAnswer2TextResourceID;
    }

    public void setAnswer2TextResourceID(Integer answer2TextResourceID) {
        mAnswer2TextResourceID = answer2TextResourceID;
    }

    public StoryStep getAnswer1NextStoryStep() {
        return mAnswer1NextStoryStep;
    }

    public void setAnswer1NextStoryStep(StoryStep answer1NextStoryStep) {
        mAnswer1NextStoryStep = answer1NextStoryStep;
    }

    public StoryStep getAnswer2NextStoryStep() {
        return mAnswer2NextStoryStep;
    }

    public void setAnswer2NextStoryStep(StoryStep answer2NextStoryStep) {
        mAnswer2NextStoryStep = answer2NextStoryStep;
    }
}
