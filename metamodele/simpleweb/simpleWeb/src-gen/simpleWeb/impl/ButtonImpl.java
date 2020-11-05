/**
 */
package simpleWeb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import simpleWeb.Button;
import simpleWeb.Page;
import simpleWeb.Paragraphe;
import simpleWeb.SimpleWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleWeb.impl.ButtonImpl#getParagraphe <em>Paragraphe</em>}</li>
 *   <li>{@link simpleWeb.impl.ButtonImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleWeb.impl.ButtonImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends MinimalEObjectImpl.Container implements Button {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleWebPackage.Literals.BUTTON;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleWebPackage.BUTTON__PARAGRAPHE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleWebPackage.BUTTON__PARAGRAPHE, oldParagraphe,
					paragraphe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleWebPackage.BUTTON__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleWebPackage.BUTTON__PAGE, oldPage,
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleWebPackage.BUTTON__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleWebPackage.BUTTON__PARAGRAPHE:
			if (resolve)
				return getParagraphe();
			return basicGetParagraphe();
		case SimpleWebPackage.BUTTON__NAME:
			return getName();
		case SimpleWebPackage.BUTTON__PAGE:
			if (resolve)
				return getPage();
			return basicGetPage();
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
		case SimpleWebPackage.BUTTON__PARAGRAPHE:
			setParagraphe((Paragraphe) newValue);
			return;
		case SimpleWebPackage.BUTTON__NAME:
			setName((String) newValue);
			return;
		case SimpleWebPackage.BUTTON__PAGE:
			setPage((Page) newValue);
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
		case SimpleWebPackage.BUTTON__PARAGRAPHE:
			setParagraphe((Paragraphe) null);
			return;
		case SimpleWebPackage.BUTTON__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimpleWebPackage.BUTTON__PAGE:
			setPage((Page) null);
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
		case SimpleWebPackage.BUTTON__PARAGRAPHE:
			return paragraphe != null;
		case SimpleWebPackage.BUTTON__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimpleWebPackage.BUTTON__PAGE:
			return page != null;
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

} //ButtonImpl
