/**
 */
package simpleWeb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraphe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleWeb.Paragraphe#getText <em>Text</em>}</li>
 *   <li>{@link simpleWeb.Paragraphe#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see simpleWeb.SimpleWebPackage#getParagraphe()
 * @model
 * @generated
 */
public interface Paragraphe extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWeb.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see simpleWeb.SimpleWebPackage#getParagraphe_Text()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getText();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simpleWeb.SimpleWebPackage#getParagraphe_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleWeb.Paragraphe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Paragraphe
