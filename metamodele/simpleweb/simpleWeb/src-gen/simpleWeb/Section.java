/**
 */
package simpleWeb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleWeb.Section#getName <em>Name</em>}</li>
 *   <li>{@link simpleWeb.Section#getParagraphe <em>Paragraphe</em>}</li>
 *   <li>{@link simpleWeb.Section#getImage <em>Image</em>}</li>
 *   <li>{@link simpleWeb.Section#getButton <em>Button</em>}</li>
 *   <li>{@link simpleWeb.Section#getLien <em>Lien</em>}</li>
 *   <li>{@link simpleWeb.Section#getLienexterne <em>Lienexterne</em>}</li>
 *   <li>{@link simpleWeb.Section#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see simpleWeb.SimpleWebPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simpleWeb.SimpleWebPackage#getSection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleWeb.Section#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Paragraphe</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWeb.Paragraphe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphe</em>' containment reference list.
	 * @see simpleWeb.SimpleWebPackage#getSection_Paragraphe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraphe> getParagraphe();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWeb.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see simpleWeb.SimpleWebPackage#getSection_Image()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImage();

	/**
	 * Returns the value of the '<em><b>Lien</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWeb.Lien}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' containment reference list.
	 * @see simpleWeb.SimpleWebPackage#getSection_Lien()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lien> getLien();

	/**
	 * Returns the value of the '<em><b>Lienexterne</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWeb.LienExterne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienexterne</em>' containment reference list.
	 * @see simpleWeb.SimpleWebPackage#getSection_Lienexterne()
	 * @model containment="true"
	 * @generated
	 */
	EList<LienExterne> getLienexterne();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWeb.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see simpleWeb.SimpleWebPackage#getSection_Section()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSection();

	/**
	 * Returns the value of the '<em><b>Button</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWeb.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' containment reference list.
	 * @see simpleWeb.SimpleWebPackage#getSection_Button()
	 * @model containment="true"
	 * @generated
	 */
	EList<Button> getButton();

} // Section
