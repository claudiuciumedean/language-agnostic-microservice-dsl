package Client.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Action;
  private ConceptPresentation props_ActionOperation;
  private ConceptPresentation props_Card;
  private ConceptPresentation props_Client;
  private ConceptPresentation props_ClientConfig;
  private ConceptPresentation props_ClientReference;
  private ConceptPresentation props_ClientType;
  private ConceptPresentation props_Desktop;
  private ConceptPresentation props_IClientType;
  private ConceptPresentation props_Image;
  private ConceptPresentation props_Link;
  private ConceptPresentation props_Mobile;
  private ConceptPresentation props_Page;
  private ConceptPresentation props_PageReference;
  private ConceptPresentation props_Text;
  private ConceptPresentation props_Title;
  private ConceptPresentation props_UIComponent;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Action:
        if (props_Action == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Action");
          props_Action = cpb.create();
        }
        return props_Action;
      case LanguageConceptSwitch.ActionOperation:
        if (props_ActionOperation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ActionOperation = cpb.create();
        }
        return props_ActionOperation;
      case LanguageConceptSwitch.Card:
        if (props_Card == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Card");
          props_Card = cpb.create();
        }
        return props_Card;
      case LanguageConceptSwitch.Client:
        if (props_Client == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Client = cpb.create();
        }
        return props_Client;
      case LanguageConceptSwitch.ClientConfig:
        if (props_ClientConfig == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ClientConfig = cpb.create();
        }
        return props_ClientConfig;
      case LanguageConceptSwitch.ClientReference:
        if (props_ClientReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa8065540525534dL, 0xa8065540525534eL, "client", "", "");
          props_ClientReference = cpb.create();
        }
        return props_ClientReference;
      case LanguageConceptSwitch.ClientType:
        if (props_ClientType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ClientType");
          props_ClientType = cpb.create();
        }
        return props_ClientType;
      case LanguageConceptSwitch.Desktop:
        if (props_Desktop == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Desktop");
          props_Desktop = cpb.create();
        }
        return props_Desktop;
      case LanguageConceptSwitch.IClientType:
        if (props_IClientType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IClientType = cpb.create();
        }
        return props_IClientType;
      case LanguageConceptSwitch.Image:
        if (props_Image == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Image");
          props_Image = cpb.create();
        }
        return props_Image;
      case LanguageConceptSwitch.Link:
        if (props_Link == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Link");
          props_Link = cpb.create();
        }
        return props_Link;
      case LanguageConceptSwitch.Mobile:
        if (props_Mobile == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Mobile");
          props_Mobile = cpb.create();
        }
        return props_Mobile;
      case LanguageConceptSwitch.Page:
        if (props_Page == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Page = cpb.create();
        }
        return props_Page;
      case LanguageConceptSwitch.PageReference:
        if (props_PageReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554051c0e24L, 0xa806554051c7f2eL, "page", "", "");
          props_PageReference = cpb.create();
        }
        return props_PageReference;
      case LanguageConceptSwitch.Text:
        if (props_Text == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Text");
          props_Text = cpb.create();
        }
        return props_Text;
      case LanguageConceptSwitch.Title:
        if (props_Title == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Title");
          props_Title = cpb.create();
        }
        return props_Title;
      case LanguageConceptSwitch.UIComponent:
        if (props_UIComponent == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("UIComponent");
          props_UIComponent = cpb.create();
        }
        return props_UIComponent;
    }
    return null;
  }
}
