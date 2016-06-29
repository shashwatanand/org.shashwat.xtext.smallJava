package org.shashwat.xtext.smallJava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'.*'", "'final'", "'class'", "'extends'", "'{'", "'}'", "'[]'", "'String'", "'Integer'", "'Boolean'", "'Decimal'", "'BigDecimal'", "'public'", "'private'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallJavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallJavaDsl.g"; }



     	private SmallJavaDslGrammarAccess grammarAccess;
     	
        public InternalSmallJavaDslParser(TokenStream input, SmallJavaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Namespace";	
       	}
       	
       	@Override
       	protected SmallJavaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamespace"
    // InternalSmallJavaDsl.g:68:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalSmallJavaDsl.g:69:2: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalSmallJavaDsl.g:70:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalSmallJavaDsl.g:77:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_smallJava_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSmallJavaDsl.g:80:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) ) ) )
            // InternalSmallJavaDsl.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) ) )
            {
            // InternalSmallJavaDsl.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) ) )
            // InternalSmallJavaDsl.g:81:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // InternalSmallJavaDsl.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalSmallJavaDsl.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalSmallJavaDsl.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // InternalSmallJavaDsl.g:87:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.shashwat.xtext.smallJava.SmallJavaDsl.QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSmallJavaDsl.g:103:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallJavaDsl.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalSmallJavaDsl.g:104:1: (lv_imports_2_0= ruleImport )
            	    // InternalSmallJavaDsl.g:105:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"org.shashwat.xtext.smallJava.SmallJavaDsl.Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSmallJavaDsl.g:121:3: ( (lv_smallJava_3_0= ruleSmallJava ) )
            // InternalSmallJavaDsl.g:122:1: (lv_smallJava_3_0= ruleSmallJava )
            {
            // InternalSmallJavaDsl.g:122:1: (lv_smallJava_3_0= ruleSmallJava )
            // InternalSmallJavaDsl.g:123:3: lv_smallJava_3_0= ruleSmallJava
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getSmallJavaSmallJavaParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_smallJava_3_0=ruleSmallJava();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"smallJava",
                    		lv_smallJava_3_0, 
                    		"org.shashwat.xtext.smallJava.SmallJavaDsl.SmallJava");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // InternalSmallJavaDsl.g:147:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSmallJavaDsl.g:148:2: (iv_ruleImport= ruleImport EOF )
            // InternalSmallJavaDsl.g:149:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSmallJavaDsl.g:156:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSmallJavaDsl.g:159:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) ) ) )
            // InternalSmallJavaDsl.g:160:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) ) )
            {
            // InternalSmallJavaDsl.g:160:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) ) )
            // InternalSmallJavaDsl.g:160:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalSmallJavaDsl.g:164:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) )
            // InternalSmallJavaDsl.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards )
            {
            // InternalSmallJavaDsl.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards )
            // InternalSmallJavaDsl.g:166:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCards();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"org.shashwat.xtext.smallJava.SmallJavaDsl.QualifiedNameWithWildCards");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSmallJavaDsl.g:190:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSmallJavaDsl.g:191:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSmallJavaDsl.g:192:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSmallJavaDsl.g:199:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSmallJavaDsl.g:202:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSmallJavaDsl.g:203:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSmallJavaDsl.g:203:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSmallJavaDsl.g:203:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalSmallJavaDsl.g:210:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmallJavaDsl.g:211:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCards"
    // InternalSmallJavaDsl.g:231:1: entryRuleQualifiedNameWithWildCards returns [String current=null] : iv_ruleQualifiedNameWithWildCards= ruleQualifiedNameWithWildCards EOF ;
    public final String entryRuleQualifiedNameWithWildCards() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCards = null;


        try {
            // InternalSmallJavaDsl.g:232:2: (iv_ruleQualifiedNameWithWildCards= ruleQualifiedNameWithWildCards EOF )
            // InternalSmallJavaDsl.g:233:2: iv_ruleQualifiedNameWithWildCards= ruleQualifiedNameWithWildCards EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildCards=ruleQualifiedNameWithWildCards();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCards.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCards"


    // $ANTLR start "ruleQualifiedNameWithWildCards"
    // InternalSmallJavaDsl.g:240:1: ruleQualifiedNameWithWildCards returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCards() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalSmallJavaDsl.g:243:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalSmallJavaDsl.g:244:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalSmallJavaDsl.g:244:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalSmallJavaDsl.g:245:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardsAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalSmallJavaDsl.g:255:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmallJavaDsl.g:256:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardsAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCards"


    // $ANTLR start "entryRuleSmallJava"
    // InternalSmallJavaDsl.g:269:1: entryRuleSmallJava returns [EObject current=null] : iv_ruleSmallJava= ruleSmallJava EOF ;
    public final EObject entryRuleSmallJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJava = null;


        try {
            // InternalSmallJavaDsl.g:270:2: (iv_ruleSmallJava= ruleSmallJava EOF )
            // InternalSmallJavaDsl.g:271:2: iv_ruleSmallJava= ruleSmallJava EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmallJava=ruleSmallJava();

            state._fsp--;

             current =iv_ruleSmallJava; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJava"


    // $ANTLR start "ruleSmallJava"
    // InternalSmallJavaDsl.g:278:1: ruleSmallJava returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) ;
    public final EObject ruleSmallJava() throws RecognitionException {
        EObject current = null;

        Token lv_final_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_attribute_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSmallJavaDsl.g:281:28: ( ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) )
            // InternalSmallJavaDsl.g:282:1: ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            {
            // InternalSmallJavaDsl.g:282:1: ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            // InternalSmallJavaDsl.g:282:2: ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}'
            {
            // InternalSmallJavaDsl.g:282:2: ( (lv_visibility_0_0= ruleVisibilityTypes ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=26 && LA4_0<=27)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallJavaDsl.g:283:1: (lv_visibility_0_0= ruleVisibilityTypes )
                    {
                    // InternalSmallJavaDsl.g:283:1: (lv_visibility_0_0= ruleVisibilityTypes )
                    // InternalSmallJavaDsl.g:284:3: lv_visibility_0_0= ruleVisibilityTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmallJavaAccess().getVisibilityVisibilityTypesEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_7);
                    lv_visibility_0_0=ruleVisibilityTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSmallJavaRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_0_0, 
                            		"org.shashwat.xtext.smallJava.SmallJavaDsl.VisibilityTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalSmallJavaDsl.g:300:3: ( (lv_final_1_0= 'final' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallJavaDsl.g:301:1: (lv_final_1_0= 'final' )
                    {
                    // InternalSmallJavaDsl.g:301:1: (lv_final_1_0= 'final' )
                    // InternalSmallJavaDsl.g:302:3: lv_final_1_0= 'final'
                    {
                    lv_final_1_0=(Token)match(input,15,FOLLOW_8); 

                            newLeafNode(lv_final_1_0, grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallJavaRule());
                    	        }
                           		setWithLastConsumed(current, "final", true, "final");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getSmallJavaAccess().getClassKeyword_2());
                
            // InternalSmallJavaDsl.g:319:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalSmallJavaDsl.g:320:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSmallJavaDsl.g:320:1: (lv_name_3_0= RULE_ID )
            // InternalSmallJavaDsl.g:321:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_3_0, grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSmallJavaDsl.g:337:2: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallJavaDsl.g:337:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmallJavaAccess().getExtendsKeyword_4_0());
                        
                    // InternalSmallJavaDsl.g:341:1: ( (otherlv_5= RULE_ID ) )
                    // InternalSmallJavaDsl.g:342:1: (otherlv_5= RULE_ID )
                    {
                    // InternalSmallJavaDsl.g:342:1: (otherlv_5= RULE_ID )
                    // InternalSmallJavaDsl.g:343:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallJavaRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

                    		newLeafNode(otherlv_5, grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_11); 

                	newLeafNode(otherlv_6, grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalSmallJavaDsl.g:358:1: ( (lv_attribute_7_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=21 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmallJavaDsl.g:359:1: (lv_attribute_7_0= ruleAttribute )
            	    {
            	    // InternalSmallJavaDsl.g:359:1: (lv_attribute_7_0= ruleAttribute )
            	    // InternalSmallJavaDsl.g:360:3: lv_attribute_7_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_11);
            	    lv_attribute_7_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmallJavaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_7_0, 
            	            		"org.shashwat.xtext.smallJava.SmallJavaDsl.Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJava"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallJavaDsl.g:388:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallJavaDsl.g:389:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallJavaDsl.g:390:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallJavaDsl.g:397:1: ruleAttribute returns [EObject current=null] : ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_datatype_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSmallJavaDsl.g:400:28: ( ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSmallJavaDsl.g:401:1: ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSmallJavaDsl.g:401:1: ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSmallJavaDsl.g:401:2: ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalSmallJavaDsl.g:401:2: ( (lv_datatype_0_0= ruleDatatype ) )
            // InternalSmallJavaDsl.g:402:1: (lv_datatype_0_0= ruleDatatype )
            {
            // InternalSmallJavaDsl.g:402:1: (lv_datatype_0_0= ruleDatatype )
            // InternalSmallJavaDsl.g:403:3: lv_datatype_0_0= ruleDatatype
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_12);
            lv_datatype_0_0=ruleDatatype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"datatype",
                    		lv_datatype_0_0, 
                    		"org.shashwat.xtext.smallJava.SmallJavaDsl.Datatype");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSmallJavaDsl.g:419:2: ( (lv_array_1_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallJavaDsl.g:420:1: (lv_array_1_0= '[]' )
                    {
                    // InternalSmallJavaDsl.g:420:1: (lv_array_1_0= '[]' )
                    // InternalSmallJavaDsl.g:421:3: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,20,FOLLOW_3); 

                            newLeafNode(lv_array_1_0, grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "array", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // InternalSmallJavaDsl.g:434:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallJavaDsl.g:435:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallJavaDsl.g:435:1: (lv_name_2_0= RULE_ID )
            // InternalSmallJavaDsl.g:436:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDatatype"
    // InternalSmallJavaDsl.g:460:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalSmallJavaDsl.g:461:2: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalSmallJavaDsl.g:462:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalSmallJavaDsl.g:469:1: ruleDatatype returns [EObject current=null] : ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        EObject this_SmallJavaType_2 = null;


         enterRule(); 
            
        try {
            // InternalSmallJavaDsl.g:472:28: ( ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType ) )
            // InternalSmallJavaDsl.g:473:1: ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType )
            {
            // InternalSmallJavaDsl.g:473:1: ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=21 && LA9_0<=25)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallJavaDsl.g:473:2: ( () ruleSimpleType )
                    {
                    // InternalSmallJavaDsl.g:473:2: ( () ruleSimpleType )
                    // InternalSmallJavaDsl.g:473:3: () ruleSimpleType
                    {
                    // InternalSmallJavaDsl.g:473:3: ()
                    // InternalSmallJavaDsl.g:474:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDatatypeAccess().getDatatypeAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_2);
                    ruleSimpleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJavaDsl.g:489:5: this_SmallJavaType_2= ruleSmallJavaType
                    {
                     
                            newCompositeNode(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SmallJavaType_2=ruleSmallJavaType();

                    state._fsp--;

                     
                            current = this_SmallJavaType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleSimpleType"
    // InternalSmallJavaDsl.g:505:1: entryRuleSimpleType returns [String current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final String entryRuleSimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleType = null;


        try {
            // InternalSmallJavaDsl.g:506:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalSmallJavaDsl.g:507:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalSmallJavaDsl.g:514:1: ruleSimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSmallJavaDsl.g:517:28: ( (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' ) )
            // InternalSmallJavaDsl.g:518:1: (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' )
            {
            // InternalSmallJavaDsl.g:518:1: (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSmallJavaDsl.g:519:2: kw= 'String'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSmallJavaDsl.g:526:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalSmallJavaDsl.g:533:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalSmallJavaDsl.g:540:2: kw= 'Decimal'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // InternalSmallJavaDsl.g:547:2: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleSmallJavaType"
    // InternalSmallJavaDsl.g:560:1: entryRuleSmallJavaType returns [EObject current=null] : iv_ruleSmallJavaType= ruleSmallJavaType EOF ;
    public final EObject entryRuleSmallJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJavaType = null;


        try {
            // InternalSmallJavaDsl.g:561:2: (iv_ruleSmallJavaType= ruleSmallJavaType EOF )
            // InternalSmallJavaDsl.g:562:2: iv_ruleSmallJavaType= ruleSmallJavaType EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmallJavaType=ruleSmallJavaType();

            state._fsp--;

             current =iv_ruleSmallJavaType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJavaType"


    // $ANTLR start "ruleSmallJavaType"
    // InternalSmallJavaDsl.g:569:1: ruleSmallJavaType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSmallJavaType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalSmallJavaDsl.g:572:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSmallJavaDsl.g:573:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSmallJavaDsl.g:573:1: ( (otherlv_0= RULE_ID ) )
            // InternalSmallJavaDsl.g:574:1: (otherlv_0= RULE_ID )
            {
            // InternalSmallJavaDsl.g:574:1: (otherlv_0= RULE_ID )
            // InternalSmallJavaDsl.g:575:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJavaType"


    // $ANTLR start "ruleVisibilityTypes"
    // InternalSmallJavaDsl.g:594:1: ruleVisibilityTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleVisibilityTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSmallJavaDsl.g:596:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalSmallJavaDsl.g:597:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalSmallJavaDsl.g:597:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallJavaDsl.g:597:2: (enumLiteral_0= 'public' )
                    {
                    // InternalSmallJavaDsl.g:597:2: (enumLiteral_0= 'public' )
                    // InternalSmallJavaDsl.g:597:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                            current = grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJavaDsl.g:603:6: (enumLiteral_1= 'private' )
                    {
                    // InternalSmallJavaDsl.g:603:6: (enumLiteral_1= 'private' )
                    // InternalSmallJavaDsl.g:603:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                            current = grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000C019000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003E80010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100010L});

}