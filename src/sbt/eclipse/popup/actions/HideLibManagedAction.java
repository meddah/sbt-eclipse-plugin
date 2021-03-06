package sbt.eclipse.popup.actions;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;

import sbt.eclipse.Constants;

/**
 * @author Joonas Javanainen
 * 
 */
public class HideLibManagedAction extends AbstractProjectAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sbt.eclipse.popup.actions.AbstractProjectAction#run(org.eclipse.jface.action
	 * .IAction, org.eclipse.core.resources.IProject)
	 */
	@Override
	protected void run(IAction action, IProject project) throws Exception {
		IFolder managedLib = project.getFolder(Constants.DEFAULT_MANAGED_LIB_FOLDER);
		if (managedLib.exists()) {
			managedLib.setHidden(true);
		}
	}

}
