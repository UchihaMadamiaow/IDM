/**
 */
package simpleWeb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleWeb.SiteWeb#getName <em>Name</em>}</li>
 *   <li>{@link simpleWeb.SiteWeb#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see simpleWeb.SimpleWebPackage#getSiteWeb()
 * @model
 * @generated
 */
public interface SiteWeb extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simpleWeb.SimpleWebPackage#getSiteWeb_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleWeb.SiteWeb#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWeb.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see simpleWeb.SimpleWebPackage#getSiteWeb_Page()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPage();

} // SiteWeb
