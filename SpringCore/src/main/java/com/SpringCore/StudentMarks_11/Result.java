package com.SpringCore.StudentMarks_11;

public class Result {
	float maths;
	float hindi;
	float english;
	float science;
	public float total_marks;

	public Result(float maths, float hindi, float english, float science) {
		super();
		this.maths = maths;
		this.hindi = hindi;
		this.english = english;
		this.science = science;
		this.total_marks = maths + hindi + english + science;
	}
}
