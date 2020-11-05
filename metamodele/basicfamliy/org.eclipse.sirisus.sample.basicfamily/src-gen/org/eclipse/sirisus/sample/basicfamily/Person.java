/**
 */
package org.eclipse.sirisus.sample.basicfamily;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirisus.sample.basicfamily.Person#getParents <em>Parents</em>}</li>
 *   <li>{@link org.eclipse.sirisus.sample.basicfamily.Person#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.sirisus.sample.basicfamily.Person#getFather <em>Father</em>}</li>
 *   <li>{@link org.eclipse.sirisus.sample.basicfamily.Person#getMathor <em>Mathor</em>}</li>
 *   <li>{@link org.eclipse.sirisus.sample.basicfamily.Person#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirisus.sample.basicfamily.BasicfamilyPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirisus.sample.basicfamily.Person}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirisus.sample.basicfamily.Person#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.eclipse.sirisus.sample.basicfamily.BasicfamilyPackage#getPerson_Parents()
	 * @see org.eclipse.sirisus.sample.basicfamily.Person#getChildren
	 * @model opposite="children" upper="2"
	 * @generated
	 */
	EList<Person> getParents();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirisus.sample.basicfamily.Person}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirisus.sample.basicfamily.Person#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.eclipse.sirisus.sample.basicfamily.BasicfamilyPackage#getPerson_Children()
	 * @see org.eclipse.sirisus.sample.basicfamily.Person#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Man)
	 * @see org.eclipse.sirisus.sample.basicfamily.BasicfamilyPackage#getPerson_Father()
	 * @model
	 * @generated
	 */
	Man getFather();

	/**
	 * Sets the value of the '{@link org.eclipse.sirisus.sample.basicfamily.Person#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Man value);

	/**
	 * Returns the value of the '<em><b>Mathor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathor</em>' reference.
	 * @see #setMathor(Woman)
	 * @see org.eclipse.sirisus.sample.basicfamily.BasicfamilyPackage#getPerson_Mathor()
	 * @model
	 * @generated
	 */
	Woman getMathor();

	/**
	 * Sets the value of the '{@link org.eclipse.sirisus.sample.basicfamily.Person#getMathor <em>Mathor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathor</em>' reference.
	 * @see #getMathor()
	 * @generated
	 */
	void setMathor(Woman value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirisus.sample.basicfamily.BasicfamilyPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirisus.sample.basicfamily.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Person
