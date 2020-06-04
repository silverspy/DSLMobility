/**
 */
package dSLMobility.impl;

import dSLMobility.DSLMobilityPackage;
import dSLMobility.Page;
import dSLMobility.Source;

import dSLMobility.SourceLogo;
import dSLMobility.SourceMenu;
import dSLMobility.SourcePres;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dSLMobility.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getLogo <em>Logo</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getGeolocalisation <em>Geolocalisation</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getHeure_ouverture <em>Heure ouverture</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getHeure_fermeture <em>Heure fermeture</em>}</li>
 *   <li>{@link dSLMobility.impl.PageImpl#getNb_Pers <em>Nb Pers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> source;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected String mail = MAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected String telephone = TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMenu() <em>Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected static final SourceMenu MENU_EDEFAULT = SourceMenu.SIDE_BAR;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected SourceMenu menu = MENU_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected static final SourcePres PRESENTATION_EDEFAULT = SourcePres.BASIQUE;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected SourcePres presentation = PRESENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected static final SourceLogo LOGO_EDEFAULT = SourceLogo.COMUTE;

	/**
	 * The cached value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected SourceLogo logo = LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeolocalisation() <em>Geolocalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeolocalisation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GEOLOCALISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeolocalisation() <em>Geolocalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeolocalisation()
	 * @generated
	 * @ordered
	 */
	protected Boolean geolocalisation = GEOLOCALISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeure_ouverture() <em>Heure ouverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure_ouverture()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_OUVERTURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeure_ouverture() <em>Heure ouverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure_ouverture()
	 * @generated
	 * @ordered
	 */
	protected int heure_ouverture = HEURE_OUVERTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeure_fermeture() <em>Heure fermeture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure_fermeture()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_FERMETURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeure_fermeture() <em>Heure fermeture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure_fermeture()
	 * @generated
	 * @ordered
	 */
	protected int heure_fermeture = HEURE_FERMETURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNb_Pers() <em>Nb Pers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNb_Pers()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_PERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNb_Pers() <em>Nb Pers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNb_Pers()
	 * @generated
	 * @ordered
	 */
	protected int nb_Pers = NB_PERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLMobilityPackage.Literals.PAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Source> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Source>(Source.class, this, DSLMobilityPackage.PAGE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMail(String newMail) {
		String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(String newTelephone) {
		String oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__TELEPHONE, oldTelephone,
					telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceMenu getMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(SourceMenu newMenu) {
		SourceMenu oldMenu = menu;
		menu = newMenu == null ? MENU_EDEFAULT : newMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__MENU, oldMenu, menu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcePres getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(SourcePres newPresentation) {
		SourcePres oldPresentation = presentation;
		presentation = newPresentation == null ? PRESENTATION_EDEFAULT : newPresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__PRESENTATION,
					oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceLogo getLogo() {
		return logo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogo(SourceLogo newLogo) {
		SourceLogo oldLogo = logo;
		logo = newLogo == null ? LOGO_EDEFAULT : newLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__LOGO, oldLogo, logo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getGeolocalisation() {
		return geolocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeolocalisation(Boolean newGeolocalisation) {
		Boolean oldGeolocalisation = geolocalisation;
		geolocalisation = newGeolocalisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__GEOLOCALISATION,
					oldGeolocalisation, geolocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeure_ouverture() {
		return heure_ouverture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeure_ouverture(int newHeure_ouverture) {
		int oldHeure_ouverture = heure_ouverture;
		heure_ouverture = newHeure_ouverture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__HEURE_OUVERTURE,
					oldHeure_ouverture, heure_ouverture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeure_fermeture() {
		return heure_fermeture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeure_fermeture(int newHeure_fermeture) {
		int oldHeure_fermeture = heure_fermeture;
		heure_fermeture = newHeure_fermeture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__HEURE_FERMETURE,
					oldHeure_fermeture, heure_fermeture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNb_Pers() {
		return nb_Pers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNb_Pers(int newNb_Pers) {
		int oldNb_Pers = nb_Pers;
		nb_Pers = newNb_Pers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLMobilityPackage.PAGE__NB_PERS, oldNb_Pers,
					nb_Pers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DSLMobilityPackage.PAGE__SOURCE:
			return ((InternalEList<?>) getSource()).basicRemove(otherEnd, msgs);
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
		case DSLMobilityPackage.PAGE__NAME:
			return getName();
		case DSLMobilityPackage.PAGE__SOURCE:
			return getSource();
		case DSLMobilityPackage.PAGE__DESCRIPTION:
			return getDescription();
		case DSLMobilityPackage.PAGE__MAIL:
			return getMail();
		case DSLMobilityPackage.PAGE__TELEPHONE:
			return getTelephone();
		case DSLMobilityPackage.PAGE__MENU:
			return getMenu();
		case DSLMobilityPackage.PAGE__PRESENTATION:
			return getPresentation();
		case DSLMobilityPackage.PAGE__LOGO:
			return getLogo();
		case DSLMobilityPackage.PAGE__GEOLOCALISATION:
			return getGeolocalisation();
		case DSLMobilityPackage.PAGE__HEURE_OUVERTURE:
			return getHeure_ouverture();
		case DSLMobilityPackage.PAGE__HEURE_FERMETURE:
			return getHeure_fermeture();
		case DSLMobilityPackage.PAGE__NB_PERS:
			return getNb_Pers();
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
		case DSLMobilityPackage.PAGE__NAME:
			setName((String) newValue);
			return;
		case DSLMobilityPackage.PAGE__SOURCE:
			getSource().clear();
			getSource().addAll((Collection<? extends Source>) newValue);
			return;
		case DSLMobilityPackage.PAGE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DSLMobilityPackage.PAGE__MAIL:
			setMail((String) newValue);
			return;
		case DSLMobilityPackage.PAGE__TELEPHONE:
			setTelephone((String) newValue);
			return;
		case DSLMobilityPackage.PAGE__MENU:
			setMenu((SourceMenu) newValue);
			return;
		case DSLMobilityPackage.PAGE__PRESENTATION:
			setPresentation((SourcePres) newValue);
			return;
		case DSLMobilityPackage.PAGE__LOGO:
			setLogo((SourceLogo) newValue);
			return;
		case DSLMobilityPackage.PAGE__GEOLOCALISATION:
			setGeolocalisation((Boolean) newValue);
			return;
		case DSLMobilityPackage.PAGE__HEURE_OUVERTURE:
			setHeure_ouverture((Integer) newValue);
			return;
		case DSLMobilityPackage.PAGE__HEURE_FERMETURE:
			setHeure_fermeture((Integer) newValue);
			return;
		case DSLMobilityPackage.PAGE__NB_PERS:
			setNb_Pers((Integer) newValue);
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
		case DSLMobilityPackage.PAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__SOURCE:
			getSource().clear();
			return;
		case DSLMobilityPackage.PAGE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__MAIL:
			setMail(MAIL_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__TELEPHONE:
			setTelephone(TELEPHONE_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__MENU:
			setMenu(MENU_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__PRESENTATION:
			setPresentation(PRESENTATION_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__LOGO:
			setLogo(LOGO_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__GEOLOCALISATION:
			setGeolocalisation(GEOLOCALISATION_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__HEURE_OUVERTURE:
			setHeure_ouverture(HEURE_OUVERTURE_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__HEURE_FERMETURE:
			setHeure_fermeture(HEURE_FERMETURE_EDEFAULT);
			return;
		case DSLMobilityPackage.PAGE__NB_PERS:
			setNb_Pers(NB_PERS_EDEFAULT);
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
		case DSLMobilityPackage.PAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DSLMobilityPackage.PAGE__SOURCE:
			return source != null && !source.isEmpty();
		case DSLMobilityPackage.PAGE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case DSLMobilityPackage.PAGE__MAIL:
			return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
		case DSLMobilityPackage.PAGE__TELEPHONE:
			return TELEPHONE_EDEFAULT == null ? telephone != null : !TELEPHONE_EDEFAULT.equals(telephone);
		case DSLMobilityPackage.PAGE__MENU:
			return menu != MENU_EDEFAULT;
		case DSLMobilityPackage.PAGE__PRESENTATION:
			return presentation != PRESENTATION_EDEFAULT;
		case DSLMobilityPackage.PAGE__LOGO:
			return logo != LOGO_EDEFAULT;
		case DSLMobilityPackage.PAGE__GEOLOCALISATION:
			return GEOLOCALISATION_EDEFAULT == null ? geolocalisation != null
					: !GEOLOCALISATION_EDEFAULT.equals(geolocalisation);
		case DSLMobilityPackage.PAGE__HEURE_OUVERTURE:
			return heure_ouverture != HEURE_OUVERTURE_EDEFAULT;
		case DSLMobilityPackage.PAGE__HEURE_FERMETURE:
			return heure_fermeture != HEURE_FERMETURE_EDEFAULT;
		case DSLMobilityPackage.PAGE__NB_PERS:
			return nb_Pers != NB_PERS_EDEFAULT;
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
		result.append(", description: ");
		result.append(description);
		result.append(", mail: ");
		result.append(mail);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(", menu: ");
		result.append(menu);
		result.append(", presentation: ");
		result.append(presentation);
		result.append(", logo: ");
		result.append(logo);
		result.append(", geolocalisation: ");
		result.append(geolocalisation);
		result.append(", heure_ouverture: ");
		result.append(heure_ouverture);
		result.append(", heure_fermeture: ");
		result.append(heure_fermeture);
		result.append(", nb_Pers: ");
		result.append(nb_Pers);
		result.append(')');
		return result.toString();
	}

} //PageImpl
