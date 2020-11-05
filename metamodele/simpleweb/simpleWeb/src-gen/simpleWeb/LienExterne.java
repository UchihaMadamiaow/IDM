/**
 */
package simpleWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Externe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleWeb.LienExterne#getName <em>Name</em>}</li>
 *   <li>{@link simpleWeb.LienExterne#getSiteweb <em>Siteweb</em>}</li>
 *   <li>{@link simpleWeb.LienExterne#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see simpleWeb.SimpleWebPackage#getLienExterne()
 * @model
 * @generated
 */
public interface LienExterne extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simpleWeb.SimpleWebPackage#getLienExterne_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleWeb.LienExterne#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Siteweb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siteweb</em>' reference.
	 * @see #setSiteweb(SiteWeb)
	 * @see simpleWeb.SimpleWebPackage#getLienExterne_Siteweb()
	 * @model
	 * @generated
	 */
	SiteWeb getSiteweb();

	/**
	 * Sets the value of the '{@link simpleWeb.LienExterne#getSiteweb <em>Siteweb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siteweb</em>' reference.
	 * @see #getSiteweb()
	 * @generated
	 */
	void setSiteweb(SiteWeb value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see simpleWeb.SimpleWebPackage#getLienExterne_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link simpleWeb.LienExterne#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // LienExterne
