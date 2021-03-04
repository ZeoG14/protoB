//******************************************************************************
// Copyright (C) 2020 University of Oklahoma Board of Trustees.
//******************************************************************************
// Last modified: Wed Feb 12 23:13:57 2020 by Chris Weaver
//******************************************************************************
// Major Modification History:
//
// 20200212 [weaver]:	Original file.
//
//******************************************************************************
//
//******************************************************************************

package edu.ou.cs.hci.assignment.prototypeb;

//import java.lang.*;
import java.util.List;
import javafx.beans.property.*;
import sun.java2d.pipe.SpanShapeRenderer;

//******************************************************************************

/**
 * The <CODE>Movie</CODE> class manages the attributes of a movie as a set of
 * properties. The properties are created in the constructor. This differs from
 * the lazy creation of properties described in the TableView API (in the Person
 * class example), because we also use the properties to store the results of
 * parsing the inputs when the application starts.
 *
 * @author  Chris Weaver
 * @version %I%, %G%
 */
public final class Movie
{
	//**********************************************************************
	// Private Members
	//**********************************************************************

	// Each attribute has a matching property of the corresponding type.

	private final SimpleStringProperty		title;
	private final SimpleStringProperty		image;

	// TODO #0: Add members for the other 15 attributes.

	//Strings
	private final SimpleStringProperty			director;
	private final SimpleStringProperty			summary;
	private final SimpleStringProperty			rating;
	private final SimpleStringProperty			comments;
	private final SimpleStringProperty			genre;

	// Integers
	private final SimpleIntegerProperty			year;
	private final SimpleIntegerProperty			reviews;


	//Doubles
	private final SimpleDoubleProperty			runtime;
	private final SimpleDoubleProperty			averageScore;

	//Booleans
	private final SimpleBooleanProperty			animated;
	private final SimpleBooleanProperty			color;
	private final SimpleBooleanProperty			picture;
	private final SimpleBooleanProperty			directing;
	private final SimpleBooleanProperty			cinematography;
	private final SimpleBooleanProperty			acting;




	//**********************************************************************
	// Constructors and Finalizer
	//**********************************************************************

	public Movie(List<String> item)
	{
		// Each attribute value must be calculated from its string.

		title = new SimpleStringProperty(item.get(0));
		image = new SimpleStringProperty(item.get(1));

		// TODO #1: Create properties for the other attributes. For non-string
		// types, look for methods in the Boolean, Integer, and Double classes.

		//Strings
		director = new SimpleStringProperty(item.get(2));
		summary = new SimpleStringProperty(item.get(3));
		rating = new SimpleStringProperty(item.get(4));
		comments = new SimpleStringProperty(item.get(5));
		genre = new SimpleStringProperty(item.get(8));

		//Integers
		year = new SimpleIntegerProperty((Integer.parseInt(item.get(6))));
		reviews = new SimpleIntegerProperty((Integer.parseInt(item.get(7))));


		//Doubles
		runtime = new SimpleDoubleProperty((Double.parseDouble(item.get(9))));
		averageScore = new SimpleDoubleProperty((Double.parseDouble(item.get(10))));

		//Boolean
		animated = new SimpleBooleanProperty((Boolean.parseBoolean(item.get(11))));
		color = new SimpleBooleanProperty((Boolean.parseBoolean(item.get(12))));
		picture = new SimpleBooleanProperty((Boolean.parseBoolean(item.get(13))));
		directing = new SimpleBooleanProperty((Boolean.parseBoolean(item.get(14))));
		cinematography = new SimpleBooleanProperty((Boolean.parseBoolean(item.get(15))));
		acting = new SimpleBooleanProperty((Boolean.parseBoolean(item.get(16))));





		// Hint for genres: An integer can be treated as a collection of
		// independently set bits. See genre code in EditorPane for examples.
	}

	//**********************************************************************
	// Public Methods (Getters and Setters)
	//**********************************************************************

	// Each attribute has methods to access and modify its value.

	public String	getTitle()
	{
		return title.get();
	}

	public void	setTitle(String v)
	{
		title.set(v);
	}

	public String	getImage()
	{
		return image.get();
	}

	public void	setImage(String v)
	{
		image.set(v);
	}

	public String getDirector()
	{
		return director.get();
	}

	public void setDirector(String v)
	{
		director.set(v);
	}


	public String getSummary() {
		return summary.get();
	}

	public void setSummary(String v) {
		summary.set(v);
	}

	public String getComments() {
		return comments.get();
	}

	public void setComments(String v) {
		comments.set(v);
	}

	public String getRating() {
		return rating.get();
	}

	public void setRating(String v) {
		rating.set(v);
	}

	public int getYear() {
		return year.get();
	}

	public void  setYear(int v) {
		year.set(v);
	}

	public boolean isColor() {
		return color.get();
	}

	public void setColor(boolean v) {
		color.set(v);
	}

	public boolean isAnimated() {
		return animated.get();
	}

	public void setAnimated(boolean v) {
		animated.set(v);
	}

	public int getReviews() {
		return reviews.get();
	}

	public void setReviews(int v) {
		reviews.set(v);
	}

	public String getGenre() {
		return genre.get();
	}

	public void setGenre(String v) {
		genre.set(v);
	}

	public double getRuntime() {
		return runtime.get();
	}

	public void setRuntime(double v) {
		runtime.set(v);
	}

	public double getAverageScore() {
		return averageScore.get();
	}

	public void setAverageScore(double v) {
		averageScore.set(v);
	}

	public boolean isPicture() {
		return picture.get();
	}

	public void setPicture(boolean v) {
		picture.set(v);
	}

	public boolean isDirecting() {
		return directing.get();
	}

	public void setDirecting(boolean v) {
		directing.set(v);
	}

	public boolean isCinematography() {
		return cinematography.get();
	}

	public void setCinematography(boolean v) {
		cinematography.set(v);
	}

	public boolean isActing() {
		return acting.get();
	}

	public void setActing(boolean v) {
		acting.set(v);
	}

	// TODO #2: Create access and modify methods for your three attributes.


}

//******************************************************************************
