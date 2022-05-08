package Client.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAction = createDescriptorForAction();
  /*package*/ final ConceptDescriptor myConceptActionOperation = createDescriptorForActionOperation();
  /*package*/ final ConceptDescriptor myConceptCard = createDescriptorForCard();
  /*package*/ final ConceptDescriptor myConceptClient = createDescriptorForClient();
  /*package*/ final ConceptDescriptor myConceptClientConfig = createDescriptorForClientConfig();
  /*package*/ final ConceptDescriptor myConceptClientReference = createDescriptorForClientReference();
  /*package*/ final ConceptDescriptor myConceptClientType = createDescriptorForClientType();
  /*package*/ final ConceptDescriptor myConceptDesktop = createDescriptorForDesktop();
  /*package*/ final ConceptDescriptor myConceptIClientType = createDescriptorForIClientType();
  /*package*/ final ConceptDescriptor myConceptImage = createDescriptorForImage();
  /*package*/ final ConceptDescriptor myConceptLink = createDescriptorForLink();
  /*package*/ final ConceptDescriptor myConceptMobile = createDescriptorForMobile();
  /*package*/ final ConceptDescriptor myConceptPage = createDescriptorForPage();
  /*package*/ final ConceptDescriptor myConceptPageReference = createDescriptorForPageReference();
  /*package*/ final ConceptDescriptor myConceptText = createDescriptorForText();
  /*package*/ final ConceptDescriptor myConceptTitle = createDescriptorForTitle();
  /*package*/ final ConceptDescriptor myConceptUIComponent = createDescriptorForUIComponent();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
    deps.aggregatedLanguage(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, "Microservice");
    deps.aggregatedLanguage(0x41009928b4904ac3L, 0xb8488158d6c0d5dbL, "BFF");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAction, myConceptActionOperation, myConceptCard, myConceptClient, myConceptClientConfig, myConceptClientReference, myConceptClientType, myConceptDesktop, myConceptIClientType, myConceptImage, myConceptLink, myConceptMobile, myConceptPage, myConceptPageReference, myConceptText, myConceptTitle, myConceptUIComponent);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Action:
        return myConceptAction;
      case LanguageConceptSwitch.ActionOperation:
        return myConceptActionOperation;
      case LanguageConceptSwitch.Card:
        return myConceptCard;
      case LanguageConceptSwitch.Client:
        return myConceptClient;
      case LanguageConceptSwitch.ClientConfig:
        return myConceptClientConfig;
      case LanguageConceptSwitch.ClientReference:
        return myConceptClientReference;
      case LanguageConceptSwitch.ClientType:
        return myConceptClientType;
      case LanguageConceptSwitch.Desktop:
        return myConceptDesktop;
      case LanguageConceptSwitch.IClientType:
        return myConceptIClientType;
      case LanguageConceptSwitch.Image:
        return myConceptImage;
      case LanguageConceptSwitch.Link:
        return myConceptLink;
      case LanguageConceptSwitch.Mobile:
        return myConceptMobile;
      case LanguageConceptSwitch.Page:
        return myConceptPage;
      case LanguageConceptSwitch.PageReference:
        return myConceptPageReference;
      case LanguageConceptSwitch.Text:
        return myConceptText;
      case LanguageConceptSwitch.Title:
        return myConceptTitle;
      case LanguageConceptSwitch.UIComponent:
        return myConceptUIComponent;
      default:
        return null;
    }
  }


  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Action", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554058d4e49L);
    b.class_(false, false, false);
    b.super_("Client.structure.UIComponent", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554053e9bc3L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148943048265");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActionOperation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "ActionOperation", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xcc684dcdf8dce3bL);
    b.class_(false, false, false);
    b.parent(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x4151f0e6b1cb88b6L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/920569258022129211");
    b.version(2);
    b.property("route", 0xcc684dcdf8dce40L).type(PrimitiveTypeId.STRING).origin("920569258022129216").done();
    b.aggregate("queryParams", 0xcc684dcdf8dce3eL).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e9a400L).optional(true).ordered(true).multiple(true).origin("920569258022129214").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCard() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Card", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa80655405656aa0L);
    b.class_(false, false, false);
    b.super_("Client.structure.UIComponent", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554053e9bc3L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148940434080");
    b.version(2);
    b.aggregate("imageSrc", 0xa80655405873006L).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e9a400L).optional(true).ordered(true).multiple(false).origin("756716148942647302").done();
    b.aggregate("title", 0xa80655405873008L).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e9a400L).optional(true).ordered(true).multiple(false).origin("756716148942647304").done();
    b.aggregate("description", 0xa8065540587300bL).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e9a400L).optional(true).ordered(true).multiple(false).origin("756716148942647307").done();
    b.aggregate("action", 0xa806554058d5e00L).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554058d4e49L).optional(true).ordered(true).multiple(true).origin("756716148943052288").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForClient() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Client", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554051c0e0eL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cb4634L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148935626254");
    b.version(2);
    b.property("mainteinerEmail", 0xa806554051c0e11L).type(PrimitiveTypeId.STRING).origin("756716148935626257").done();
    b.property("description", 0xa806554051c0e13L).type(PrimitiveTypeId.STRING).origin("756716148935626259").done();
    b.property("version", 0xa806554051c0e16L).type(PrimitiveTypeId.STRING).origin("756716148935626262").done();
    b.aggregate("pages", 0xa806554052446acL).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb103b898L).optional(true).ordered(true).multiple(true).origin("756716148936165036").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForClientConfig() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "ClientConfig", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x56a8c307f66dc0c2L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/6244455322315768002");
    b.version(2);
    b.aggregate("mobileClientRef", 0xa806554052709d3L).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa8065540525534dL).optional(true).ordered(true).multiple(false).origin("756716148936346067").done();
    b.aggregate("desktopClientRef", 0xa806554052709eeL).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa8065540525534dL).optional(true).ordered(true).multiple(false).origin("756716148936346094").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForClientReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "ClientReference", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa8065540525534dL);
    b.class_(false, false, false);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148936233805");
    b.version(2);
    b.associate("client", 0xa8065540525534eL).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554051c0e0eL).optional(false).origin("756716148936233806").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForClientType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "ClientType", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cad68bL);
    b.class_(false, false, false);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/8033641832263636619");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDesktop() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Desktop", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cb464aL);
    b.class_(false, false, false);
    b.super_("Client.structure.ClientType", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cad68bL);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/8033641832263665226");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIClientType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "IClientType", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cb4634L);
    b.interface_();
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/8033641832263665204");
    b.version(2);
    b.aggregate("clientType", 0x6f7d3aaeb0cb463eL).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cad68bL).optional(true).ordered(true).multiple(false).origin("8033641832263665214").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForImage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Image", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554059973baL);
    b.class_(false, false, false);
    b.super_("Client.structure.UIComponent", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554053e9bc3L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148943844282");
    b.version(2);
    b.property("altText", 0xa806554059973c4L).type(PrimitiveTypeId.STRING).origin("756716148943844292").done();
    b.aggregate("imgSrc", 0xa806554059973bbL).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e9a400L).optional(true).ordered(true).multiple(false).origin("756716148943844283").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForLink() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Link", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554058d4e4aL);
    b.class_(false, false, false);
    b.super_("Client.structure.Action", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554058d4e49L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148943048266");
    b.version(2);
    b.property("text", 0xa806554058e8461L).type(PrimitiveTypeId.STRING).origin("756716148943127649").done();
    b.aggregate("page", 0xa806554058d4e4dL).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554051c0e24L).optional(false).ordered(true).multiple(false).origin("756716148943048269").done();
    b.aggregate("queryParam", 0xa806554058d4e4fL).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e9a400L).optional(true).ordered(true).multiple(false).origin("756716148943048271").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMobile() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Mobile", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cb4640L);
    b.class_(false, false, false);
    b.super_("Client.structure.ClientType", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cad68bL);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/8033641832263665216");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Page", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb103b898L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/8033641832267364504");
    b.version(2);
    b.property("route", 0xa8065540532a932L).type(PrimitiveTypeId.STRING).origin("756716148937107762").done();
    b.property("bffRoute", 0xa80655405604912L).type(PrimitiveTypeId.STRING).origin("756716148940097810").done();
    b.aggregate("bff", 0xa806554054870e5L).target(0x41009928b4904ac3L, 0xb8488158d6c0d5dbL, 0xa80655405469adaL).optional(false).ordered(true).multiple(false).origin("756716148938535141").done();
    b.aggregate("entityType", 0xa806554056048a5L).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e0e556L).optional(false).ordered(true).multiple(false).origin("756716148940097701").done();
    b.aggregate("queryParams", 0xa806554056048a6L).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e9a400L).optional(true).ordered(true).multiple(true).origin("756716148940097702").done();
    b.aggregate("components", 0xa806554056d9b14L).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554053e9bc3L).optional(true).ordered(true).multiple(true).origin("756716148940970772").done();
    b.aggregate("actions", 0xcc684dcdf8dde8dL).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xcc684dcdf8dce3bL).optional(true).ordered(true).multiple(true).origin("920569258022133389").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPageReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "PageReference", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554051c0e24L);
    b.class_(false, false, false);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148935626276");
    b.version(2);
    b.associate("page", 0xa806554051c7f2eL).target(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb103b898L).optional(false).origin("756716148935655214").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForText() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Text", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554059ff916L);
    b.class_(false, false, false);
    b.super_("Client.structure.UIComponent", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554053e9bc3L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148944271638");
    b.version(2);
    b.aggregate("text", 0xa806554059ff919L).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e9a400L).optional(true).ordered(true).multiple(false).origin("756716148944271641").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTitle() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "Title", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa8065540571b850L);
    b.class_(false, false, false);
    b.super_("Client.structure.UIComponent", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554053e9bc3L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148941240400");
    b.version(2);
    b.aggregate("text", 0xa8065540571b851L).target(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e9a400L).optional(true).ordered(true).multiple(false).origin("756716148941240401").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForUIComponent() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Client", "UIComponent", 0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554053e9bc3L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L);
    b.origin("r:98ed726a-3e0c-430f-bdae-c3e04664f756(Client.structure)/756716148937890755");
    b.version(2);
    return b.create();
  }
}
