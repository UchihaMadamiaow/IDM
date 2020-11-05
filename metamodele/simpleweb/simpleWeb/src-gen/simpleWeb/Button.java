/**
 */
package simpleWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleWeb.Button#getParagraphe <em>Paragraphe</em>}</li>
 *   <li>{@link simpleWeb.Button#getName <em>Name</em>}</li>
 *   <li>{@link simpleWeb.Button#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see simpleWeb.SimpleWebPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends EObject {

	/**
	 * Returns the value of the '<em><b>Paragraphe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphe</em>' reference.
	 * @see #setParagraphe(Paragraphe)
	 * @see simpleWeb.SimpleWebPackage#getButton_Paragraphe()
	 * @model
	 * @generated
	 */
	Paragraphe getParagraphe();

	/**
	 * Sets the value of the '{@link simpleWeb.Button#getParagraphe <em>Paragraphe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraphe</em>' reference.
	 * @see #getParagraphe()
	 * @generated
	 */
	void setParagraphe(Paragraphe value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simpleWeb.SimpleWebPackage#getButton_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleWeb.Button#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(Page)
	 * @see simpleWeb.SimpleWebPackage#getButton_Page()
	 * @model
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link simpleWeb.Button#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);
} // Button
