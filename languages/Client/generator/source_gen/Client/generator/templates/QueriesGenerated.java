package Client.generator.templates;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.Map;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import java.util.Collection;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SConcept;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetValue_1_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_2_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_3_0(final PropertyMacroContext _context) {
    if (SLinkOperations.getTarget(_context.getNode(), LINKS.mobileClientRef$e8gI) != null) {
      return "<MobileApp/>";
    } else {
      return "<p>Mobile app not implemented</p>";
    }
  }
  public static Object propertyMacro_GetValue_3_1(final PropertyMacroContext _context) {
    if (SLinkOperations.getTarget(_context.getNode(), LINKS.desktopClientRef$eto8) != null) {
      return "<DesktopApp/>";
    } else {
      return "<p>Desktop app not implemented</p>";
    }
  }
  public static Object propertyMacro_GetValue_4_0(final PropertyMacroContext _context) {
    if (SPropertyOperations.getBoolean(_context.getNode(), PROPS.isHomePage$2y7w)) {
      return "/";
    }
    return SPropertyOperations.getString(_context.getNode(), PROPS.route$ZzY4);
  }
  public static Object propertyMacro_GetValue_4_1(final PropertyMacroContext _context) {
    return "<" + SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL) + "/>";
  }
  public static Object propertyMacro_GetValue_4_2(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_4_3(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.route$ZzY4);
  }
  public static Object propertyMacro_GetValue_4_4(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_4_5(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_4_6(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_4_7(final PropertyMacroContext _context) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), LINKS.clientType$3QV), CONCEPTS.Mobile$b9)) {
      return "MobileApp";
    }
    return "DesktopApp";
  }
  public static Iterable<SNode> sourceNodesQuery_4_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.pages$VDa9);
  }
  public static Iterable<SNode> sourceNodesQuery_4_1(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.pages$VDa9);
  }
  public static Iterable<SNode> sourceNodesQuery_4_2(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.pages$VDa9);
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("756716148937169909", new SNsQ(i++));
    snsqMethods.put("756716148937253774", new SNsQ(i++));
    snsqMethods.put("756716148937758009", new SNsQ(i++));
  }
  @NotNull
  @Override
  public SourceNodesQuery getSourceNodesQuery(@NotNull QueryKey identity) {
    SourceNodesQuery query = identity.forFunctionNode(snsqMethods);
    return (query != null ? query : super.getSourceNodesQuery(identity));
  }
  private static class SNsQ implements SourceNodesQuery {
    private final int methodKey;
    public SNsQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @NotNull
    public Collection<SNode> evaluate(@NotNull SourceSubstituteMacroNodesContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_4_0(ctx));
        case 1:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_4_1(ctx));
        case 2:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_4_2(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("756716148936437648", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "appName"));
    pvqMethods.put("756716148936429056", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "appName"));
    pvqMethods.put("756716148936440451", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "mobileApp"));
    pvqMethods.put("756716148936450560", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "desktopApp"));
    pvqMethods.put("756716148937171386", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "route"));
    pvqMethods.put("756716148937177813", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "page"));
    pvqMethods.put("756716148936558295", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "name"));
    pvqMethods.put("756716148937254736", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "route"));
    pvqMethods.put("756716148937263808", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "pageName"));
    pvqMethods.put("756716148937760200", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "PageName"));
    pvqMethods.put("756716148937773736", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "name"));
    pvqMethods.put("756716148936531953", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "name"));
  }
  @NotNull
  @Override
  public PropertyValueQuery getPropertyValueQuery(@NotNull QueryKey identity) {
    PropertyValueQuery query = identity.forTemplateNode(pvqMethods);
    return (query != null ? query : super.getPropertyValueQuery(identity));
  }
  private static class PVQ extends PropertyValueQuery.Base {
    private final int methodKey;
    /*package*/ PVQ(int methodKey, SProperty property, String templateValue) {
      super(property, templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull PropertyMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.propertyMacro_GetValue_1_0(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetValue_2_0(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetValue_3_0(ctx);
        case 3:
          return QueriesGenerated.propertyMacro_GetValue_3_1(ctx);
        case 4:
          return QueriesGenerated.propertyMacro_GetValue_4_0(ctx);
        case 5:
          return QueriesGenerated.propertyMacro_GetValue_4_1(ctx);
        case 6:
          return QueriesGenerated.propertyMacro_GetValue_4_2(ctx);
        case 7:
          return QueriesGenerated.propertyMacro_GetValue_4_3(ctx);
        case 8:
          return QueriesGenerated.propertyMacro_GetValue_4_4(ctx);
        case 9:
          return QueriesGenerated.propertyMacro_GetValue_4_5(ctx);
        case 10:
          return QueriesGenerated.propertyMacro_GetValue_4_6(ctx);
        case 11:
          return QueriesGenerated.propertyMacro_GetValue_4_7(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty isHomePage$2y7w = MetaAdapterFactory.getProperty(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb103b898L, 0xa806554052e3241L, "isHomePage");
    /*package*/ static final SProperty route$ZzY4 = MetaAdapterFactory.getProperty(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb103b898L, 0xa8065540532a932L, "route");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink mobileClientRef$e8gI = MetaAdapterFactory.getContainmentLink(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x56a8c307f66dc0c2L, 0xa806554052709d3L, "mobileClientRef");
    /*package*/ static final SContainmentLink desktopClientRef$eto8 = MetaAdapterFactory.getContainmentLink(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x56a8c307f66dc0c2L, 0xa806554052709eeL, "desktopClientRef");
    /*package*/ static final SContainmentLink clientType$3QV = MetaAdapterFactory.getContainmentLink(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cb4634L, 0x6f7d3aaeb0cb463eL, "clientType");
    /*package*/ static final SContainmentLink pages$VDa9 = MetaAdapterFactory.getContainmentLink(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0xa806554051c0e0eL, 0xa806554052446acL, "pages");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Mobile$b9 = MetaAdapterFactory.getConcept(0x48e57d507e0f4c8fL, 0x93fc859018228309L, 0x6f7d3aaeb0cb4640L, "Client.structure.Mobile");
  }
}