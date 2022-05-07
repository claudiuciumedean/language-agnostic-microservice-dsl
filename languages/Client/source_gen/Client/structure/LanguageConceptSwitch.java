package Client.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Client = 0;
  public static final int ClientConfig = 1;
  public static final int ClientReference = 2;
  public static final int ClientType = 3;
  public static final int Desktop = 4;
  public static final int IClientType = 5;
  public static final int Mobile = 6;
  public static final int Page = 7;
  public static final int PageReference = 8;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x48e57d507e0f4c8fL, 0x93fc859018228309L);
    builder.put(0xa806554051c0e0eL, Client);
    builder.put(0x56a8c307f66dc0c2L, ClientConfig);
    builder.put(0xa8065540525534dL, ClientReference);
    builder.put(0x6f7d3aaeb0cad68bL, ClientType);
    builder.put(0x6f7d3aaeb0cb464aL, Desktop);
    builder.put(0x6f7d3aaeb0cb4634L, IClientType);
    builder.put(0x6f7d3aaeb0cb4640L, Mobile);
    builder.put(0x6f7d3aaeb103b898L, Page);
    builder.put(0xa806554051c0e24L, PageReference);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}