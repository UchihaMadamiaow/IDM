/**
 */
package simpleWeb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simpleWeb.Button;
import simpleWeb.Image;
import simpleWeb.Lien;
import simpleWeb.LienExterne;
import simpleWeb.Paragraphe;
import simpleWeb.Section;
import simpleWeb.SimpleWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleWeb.impl.SectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleWeb.impl.SectionImpl#getParagraphe <em>Paragraphe</em>}</li>
 *   <li>{@link simpleWeb.impl.SectionImpl#getImage <em>Image</em>}</li>
 *   <li>{@link simpleWeb.impl.SectionImpl#getButton <em>Button</em>}</li>
 *   <li>{@link simpleWeb.impl.SectionImpl#getLien <em>Lien</em>}</li>
 *   <li>{@link simpleWeb.impl.SectionImpl#getLienexterne <em>Lienexterne</em>}</li>
 *   <li>{@link simpleWeb.impl.SectionImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section {
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
	 * The cached value of the '{@link #getParagraphe() <em>Paragraphe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphe()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraphe> paragraphe;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> image;

	/**
	 * The cached value of the '{@link #getButton() <em>Button</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButton()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> button;

	/**
	 * The cached value of the '{@link #getLien() <em>Lien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLien()
	 * @generated
	 * @ordered
	 */
	protected EList<Lien> lien;

	/**
	 * The cached value of the '{@link #getLienexterne() <em>Lienexterne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienexterne()
	 * @generated
	 * @ordered
	 */
	protected EList<LienExterne> lienexterne;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleWebPackage.Literals.SECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleWebPackage.SECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraphe> getParagraphe() {
		if (paragraphe == null) {
			paragraphe = new EObjectContainmentEList<Paragraphe>(Paragraphe.class, this,
					SimpleWebPackage.SECTION__PARAGRAPHE);
		}
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<Image>(Image.class, this, SimpleWebPackage.SECTION__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lien> getLien() {
		if (lien == null) {
			lien = new EObjectContainmentEList<Lien>(Lien.class, this, SimpleWebPackage.SECTION__LIEN);
		}
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LienExterne> getLienexterne() {
		if (lienexterne == null) {
			lienexterne = new EObjectContainmentEList<LienExterne>(LienExterne.class, this,
					SimpleWebPackage.SECTION__LIENEXTERNE);
		}
		return lienexterne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<Section>(Section.class, this, SimpleWebPackage.SECTION__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getButton() {
		if (button == null) {
			button = new EObjectContainmentEList<Button>(Button.class, this, SimpleWebPackage.SECTION__BUTTON);
		}
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleWebPackage.SECTION__PARAGRAPHE:
			return ((InternalEList<?>) getParagraphe()).basicRemove(otherEnd, msgs);
		case SimpleWebPackage.SECTION__IMAGE:
			return ((InternalEList<?>) getImage()).basicRemove(otherEnd, msgs);
		case SimpleWebPackage.SECTION__BUTTON:
			return ((InternalEList<?>) getButton()).basicRemove(otherEnd, msgs);
		case SimpleWebPackage.SECTION__LIEN:
			return ((InternalEList<?>) getLien()).basicRemove(otherEnd, msgs);
		case SimpleWebPackage.SECTION__LIENEXTERNE:
			return ((InternalEList<?>) getLienexterne()).basicRemove(otherEnd, msgs);
		case SimpleWebPackage.SECTION__SECTION:
			return ((InternalEList<?>) getSection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleWebPackage.SECTION__NAME:
			return getName();
		case SimpleWebPackage.SECTION__PARAGRAPHE:
			return getParagraphe();
		case SimpleWebPackage.SECTION__IMAGE:
			return getImage();
		case SimpleWebPackage.SECTION__BUTTON:
			return getButton();
		case SimpleWebPackage.SECTION__LIEN:
			return getLien();
		case SimpleWebPackage.SECTION__LIENEXTERNE:
			return getLienexterne();
		case SimpleWebPackage.SECTION__SECTION:
			return getSection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimpleWebPackage.SECTION__NAME:
			setName((String) newValue);
			return;
		case SimpleWebPackage.SECTION__PARAGRAPHE:
			getParagraphe().clear();
			getParagraphe().addAll((Collection<? extends Paragraphe>) newValue);
			return;
		case SimpleWebPackage.SECTION__IMAGE:
			getImage().clear();
			getImage().addAll((Collection<? extends Image>) newValue);
			return;
		case SimpleWebPackage.SECTION__BUTTON:
			getButton().clear();
			getButton().addAll((Collection<? extends Button>) newValue);
			return;
		case SimpleWebPackage.SECTION__LIEN:
			getLien().clear();
			getLien().addAll((Collection<? extends Lien>) newValue);
			return;
		case SimpleWebPackage.SECTION__LIENEXTERNE:
			getLienexterne().clear();
			getLienexterne().addAll((Collection<? extends LienExterne>) newValue);
			return;
		case SimpleWebPackage.SECTION__SECTION:
			getSection().clear();
			getSection().addAll((Collection<? extends Section>) newValue);
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
		case SimpleWebPackage.SECTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimpleWebPackage.SECTION__PARAGRAPHE:
			getParagraphe().clear();
			return;
		case SimpleWebPackage.SECTION__IMAGE:
			getImage().clear();
			return;
		case SimpleWebPackage.SECTION__BUTTON:
			getButton().clear();
			return;
		case SimpleWebPackage.SECTION__LIEN:
			getLien().clear();
			return;
		case SimpleWebPackage.SECTION__LIENEXTERNE:
			getLienexterne().clear();
			return;
		case SimpleWebPackage.SECTION__SECTION:
			getSection().clear();
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
		case SimpleWebPackage.SECTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimpleWebPackage.SECTION__PARAGRAPHE:
			return paragraphe != null && !paragraphe.isEmpty();
		case SimpleWebPackage.SECTION__IMAGE:
			return image != null && !image.isEmpty();
		case SimpleWebPackage.SECTION__BUTTON:
			return button != null && !button.isEmpty();
		case SimpleWebPackage.SECTION__LIEN:
			return lien != null && !lien.isEmpty();
		case SimpleWebPackage.SECTION__LIENEXTERNE:
			return lienexterne != null && !lienexterne.isEmpty();
		case SimpleWebPackage.SECTION__SECTION:
			return section != null && !section.isEmpty();
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

} //SectionImpl
