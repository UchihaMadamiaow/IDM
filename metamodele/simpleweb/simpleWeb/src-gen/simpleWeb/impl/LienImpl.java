/**
 */
package simpleWeb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import simpleWeb.Lien;
import simpleWeb.Page;
import simpleWeb.Paragraphe;
import simpleWeb.SimpleWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleWeb.impl.LienImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleWeb.impl.LienImpl#getPage <em>Page</em>}</li>
 *   <li>{@link simpleWeb.impl.LienImpl#getParagraphe <em>Paragraphe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienImpl extends MinimalEObjectImpl.Container implements Lien {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected Page page;
	/**
	 * The cached value of the '{@link #getParagraphe() <em>Paragraphe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphe()
	 * @generated
	 * @ordered
	 */
	protected Paragraphe paragraphe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleWebPackage.Literals.LIEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleWebPackage.LIEN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		if (page != null && page.eIsProxy()) {
			InternalEObject oldPage = (InternalEObject) page;
			page = (Page) eResolveProxy(oldPage);
			if (page != oldPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleWebPackage.LIEN__PAGE, oldPage,
							page));
			}
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		Page oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleWebPackage.LIEN__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe getParagraphe() {
		if (paragraphe != null && paragraphe.eIsProxy()) {
			InternalEObject oldParagraphe = (InternalEObject) paragraphe;
			paragraphe = (Paragraphe) eResolveProxy(oldParagraphe);
			if (paragraphe != oldParagraphe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleWebPackage.LIEN__PARAGRAPHE,
							oldParagraphe, paragraphe));
			}
		}
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe basicGetParagraphe() {
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphe(Paragraphe newParagraphe) {
		Paragraphe oldParagraphe = paragraphe;
		paragraphe = newParagraphe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleWebPackage.LIEN__PARAGRAPHE, oldParagraphe,
					paragraphe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleWebPackage.LIEN__NAME:
			return getName();
		case SimpleWebPackage.LIEN__PAGE:
			if (resolve)
				return getPage();
			return basicGetPage();
		case SimpleWebPackage.LIEN__PARAGRAPHE:
			if (resolve)
				return getParagraphe();
			return basicGetParagraphe();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimpleWebPackage.LIEN__NAME:
			setName((String) newValue);
			return;
		case SimpleWebPackage.LIEN__PAGE:
			setPage((Page) newValue);
			return;
		case SimpleWebPackage.LIEN__PARAGRAPHE:
			setParagraphe((Paragraphe) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimpleWebPackage.LIEN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimpleWebPackage.LIEN__PAGE:
			setPage((Page) null);
			return;
		case SimpleWebPackage.LIEN__PARAGRAPHE:
			setParagraphe((Paragraphe) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimpleWebPackage.LIEN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimpleWebPackage.LIEN__PAGE:
			return page != null;
		case SimpleWebPackage.LIEN__PARAGRAPHE:
			return paragraphe != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LienImpl
