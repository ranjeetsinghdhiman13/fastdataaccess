package com.ws.data.contact;

import $method.getJavaTypeImportString();

/**
 * Please do not change anything in this class. 
 * All changes may be done in ContactBaseVO
 * @author Warrior Showcase
 *
 */
public class ContactBaseVO
{

	//attributes of class
		/**
	 * ContactId
	 */
	private		 java.lang.Integer ContactId;
		/**
	 * Title
	 */
	private		 java.lang.String Title;
		/**
	 * FirstName
	 */
	private		 java.lang.String FirstName;
		/**
	 * LastName
	 */
	private		 java.lang.String LastName;
		/**
	 * MiddleName
	 */
	private		 java.lang.String MiddleName;
	
	//method definitions
		public int compareTo( 
		ContactBaseVO inContactBaseVOcompareTo)  {
		
	}
			
	//toString
	@Override
	public String toString() {
		StringBuffer ret = new StringBuffer();
				return ret.toString();
	}

	//Getters and setters section for instance variables
			/**
	 * Get the value of ContactId
	 * @return java.lang.Integer ContactId
	 */
	public java.lang.Integer getContactId() {
		return ContactId;
	}
		
		/**
	 * Set the value of ContactId
	 * @param ContactId
	 */
	public void setContactId(int ContactId) {
		this.ContactId = ContactId;
	}
				/**
	 * Get the value of Title
	 * @return java.lang.String Title
	 */
	public java.lang.String getTitle() {
		return Title;
	}
		
		/**
	 * Set the value of Title
	 * @param Title
	 */
	public void setTitle(int Title) {
		this.Title = Title;
	}
				/**
	 * Get the value of FirstName
	 * @return java.lang.String FirstName
	 */
	public java.lang.String getFirstName() {
		return FirstName;
	}
		
		/**
	 * Set the value of FirstName
	 * @param FirstName
	 */
	public void setFirstName(int FirstName) {
		this.FirstName = FirstName;
	}
				/**
	 * Get the value of LastName
	 * @return java.lang.String LastName
	 */
	public java.lang.String getLastName() {
		return LastName;
	}
		
		/**
	 * Set the value of LastName
	 * @param LastName
	 */
	public void setLastName(int LastName) {
		this.LastName = LastName;
	}
				/**
	 * Get the value of MiddleName
	 * @return java.lang.String MiddleName
	 */
	public java.lang.String getMiddleName() {
		return MiddleName;
	}
		
		/**
	 * Set the value of MiddleName
	 * @param MiddleName
	 */
	public void setMiddleName(int MiddleName) {
		this.MiddleName = MiddleName;
	}
		
}
